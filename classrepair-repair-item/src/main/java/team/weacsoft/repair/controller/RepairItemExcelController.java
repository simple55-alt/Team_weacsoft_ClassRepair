package team.weacsoft.repair.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import team.weacsoft.common.exception.handler.ApiResp;
import team.weacsoft.repair.service.RepairItemExcelService;

/**
 * @author GreenHatHG
 */

@RestController
@RequestMapping(value="/repair_item")
@Validated
public class RepairItemExcelController {

    @Autowired
    private RepairItemExcelService repairItemExcelService;

    @PreAuthorize("hasAnyRole('3', '4', '5')")
    @GetMapping("/excel")
    public ResponseEntity<ApiResp> getExcel(@RequestParam(name = "start_time", required = false)Long startTime,
                                            @RequestParam(name = "end_time", required = false) Long endTime){
        if(startTime == null || endTime == null){
            startTime = 0L;
            endTime = 0L;
        }
        return ApiResp.ok(repairItemExcelService.getExcel(startTime, endTime));
    }
}
