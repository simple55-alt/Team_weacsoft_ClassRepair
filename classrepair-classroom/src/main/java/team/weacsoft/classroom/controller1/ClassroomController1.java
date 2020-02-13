package team.weacsoft.classroom.controller1;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import team.weacsoft.classroom.service.IClassroomService;
import team.weacsoft.common.exception.handler.ApiResp;

import javax.validation.constraints.NotNull;

/**
 * 课室管理
 * @author GreenHatHG
 * @since 2020-01-27
 */
@Validated
@RestController
@RequestMapping(value="/api/v1")
public class ClassroomController1 {

    private IClassroomService classroomService;

    @Autowired
    public ClassroomController1(IClassroomService classroomService) {
        this.classroomService = classroomService;
    }

    /**
     * 获取课室信息
     * @return
     */
    @GetMapping("/public/classrooms")
    public ResponseEntity<ApiResp> getClassRooms(){
        return ApiResp.ok(classroomService.getClassRooms());
    }

    /**
     * 根据id获取某一课室
     * @param id
     * @return
     */
    @GetMapping("/public/classrooms/classid")
    public ResponseEntity<ApiResp> getClassRoomById(@NotNull Integer id){
        return ApiResp.ok(classroomService.getClassroomById(id));
    }

}
