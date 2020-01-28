package team.weacsoft;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import team.weacsoft.classroom.entity.Classroom;
import team.weacsoft.classroom.service.IClassroomService;

/**
 * @author GreenHatHG
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ClassroomTest {
    @Autowired
    private IClassroomService classroomService;

    @Test
    public void addClassRoom() {
        String s = "10001\tA1\t1\t02\n" +
                "10002\tA1\t1\t03\n" +
                "10003\tA1\t1\t04\n" +
                "10004\tA1\t1\t05\n" +
                "10005\tA1\t1\t07\n" +
                "10006\tA1\t1\t08\n" +
                "10007\tA1\t1\t09\n" +
                "10008\tA1\t1\t10\n" +
                "10009\tA1\t2\t02\n" +
                "10010\tA1\t2\t03\n" +
                "10011\tA1\t2\t04\n" +
                "10012\tA1\t2\t05\n" +
                "10013\tA1\t2\t07\n" +
                "10014\tA1\t2\t08\n" +
                "10015\tA1\t2\t09\n" +
                "10016\tA1\t2\t10\n" +
                "10017\tA1\t3\t02\n" +
                "10018\tA1\t3\t03\n" +
                "10019\tA1\t3\t04\n" +
                "10020\tA1\t3\t05\n" +
                "10021\tA1\t3\t07\n" +
                "10022\tA1\t3\t08\n" +
                "10023\tA1\t3\t09\n" +
                "10024\tA1\t3\t10\n" +
                "10025\tA1\t4\t02\n" +
                "10026\tA1\t4\t03\n" +
                "10027\tA1\t4\t04\n" +
                "10028\tA1\t4\t05\n" +
                "10029\tA1\t4\t08\n" +
                "10030\tA1\t4\t09\n" +
                "10031\tA1\t4\t10\n" +
                "10032\tA2\t1\t02\n" +
                "10033\tA2\t1\t03\n" +
                "10034\tA2\t1\t04\n" +
                "10035\tA2\t1\t05\n" +
                "10036\tA2\t1\t07\n" +
                "10037\tA2\t1\t09\n" +
                "10038\tA2\t1\t10\n" +
                "10039\tA2\t2\t02\n" +
                "10040\tA2\t2\t03\n" +
                "10041\tA2\t2\t04\n" +
                "10042\tA2\t2\t05\n" +
                "10043\tA2\t2\t07\n" +
                "10044\tA2\t2\t08\n" +
                "10045\tA2\t2\t09\n" +
                "10046\tA2\t2\t10\n" +
                "10047\tA2\t3\t02\n" +
                "10048\tA2\t3\t03\n" +
                "10049\tA2\t3\t04\n" +
                "10050\tA2\t3\t05\n" +
                "10051\tA2\t3\t07\n" +
                "10052\tA2\t3\t08\n" +
                "10053\tA2\t3\t09\n" +
                "10054\tA2\t3\t10\n" +
                "10055\tA2\t4\t02\n" +
                "10056\tA2\t4\t03\n" +
                "10057\tA2\t4\t04\n" +
                "10058\tA2\t4\t05\n" +
                "10059\tA2\t4\t08\n" +
                "10060\tA2\t4\t09\n" +
                "10061\tA2\t4\t10\n" +
                "10062\tA3\t1\t01\n" +
                "10063\tA3\t1\t02\n" +
                "10064\tA3\t1\t03\n" +
                "10065\tA3\t1\t04\n" +
                "10066\tA3\t1\t05\n" +
                "10067\tA3\t1\t08\n" +
                "10068\tA3\t1\t09\n" +
                "10069\tA3\t1\t10\n" +
                "10070\tA3\t2\t01\n" +
                "10071\tA3\t2\t02\n" +
                "10072\tA3\t2\t03\n" +
                "10073\tA3\t2\t04\n" +
                "10074\tA3\t2\t05\n" +
                "10075\tA3\t2\t08\n" +
                "10076\tA3\t2\t09\n" +
                "10077\tA3\t2\t10\n" +
                "10078\tA3\t3\t01\n" +
                "10079\tA3\t3\t02\n" +
                "10080\tA3\t3\t03\n" +
                "10091\tA3\t3\t04\n" +
                "10092\tA3\t3\t05\n" +
                "10093\tA3\t3\t08\n" +
                "10094\tA3\t3\t09\n" +
                "10095\tA3\t3\t10\n" +
                "10096\tA3\t4\t02\n" +
                "10097\tA3\t4\t03\n" +
                "10098\tA3\t4\t04\n" +
                "10099\tA3\t4\t09\n" +
                "10100\tA3\t4\t10\n" +
                "10101\tA4\t2\t01\n" +
                "10102\tA4\t2\t02\n" +
                "10103\tA4\t2\t03\n" +
                "10104\tA4\t2\t04\n" +
                "10105\tA4\t2\t05\n" +
                "10106\tA4\t2\t08\n" +
                "10107\tA4\t2\t09\n" +
                "10108\tA4\t2\t10\n" +
                "10109\tA4\t3\t01\n" +
                "10110\tA4\t3\t02\n" +
                "10111\tA4\t3\t03\n" +
                "10112\tA4\t3\t04\n" +
                "10113\tA4\t3\t05\n" +
                "10114\tA4\t3\t08\n" +
                "10115\tA4\t3\t09\n" +
                "10116\tA4\t3\t10\n" +
                "10117\tA4\t4\t01\n" +
                "10118\tA4\t4\t02\n" +
                "10119\tA4\t4\t03\n" +
                "10120\tA4\t4\t04\n" +
                "10121\tA4\t4\t05\n" +
                "10122\tA4\t4\t08\n" +
                "10123\tA4\t4\t09\n" +
                "10124\tA4\t4\t10\n" +
                "10125\tA5\t1\t01\n" +
                "10126\tA5\t1\t02\n" +
                "10127\tA5\t1\t03\n" +
                "10128\tA5\t1\t05\n" +
                "10129\tA5\t1\t07\n" +
                "10130\tA5\t1\t08\n" +
                "10131\tA5\t1\t09\n" +
                "10132\tA5\t1\t10\n" +
                "10133\tA5\t1\t11\n" +
                "10134\tA5\t1\t12\n" +
                "10135\tA5\t2\t01\n" +
                "10136\tA5\t2\t02\n" +
                "10137\tA5\t2\t03\n" +
                "10138\tA5\t2\t04\n" +
                "10139\tA5\t2\t05\n" +
                "10140\tA5\t2\t06\n" +
                "10141\tA5\t3\t01\n" +
                "10142\tA5\t3\t03\n" +
                "10143\tA5\t3\t04\n" +
                "10144\tA5\t3\t05\n" +
                "10145\tA5\t3\t06\n" +
                "10146\tA5\t4\t01\n" +
                "10147\tA5\t4\t03\n" +
                "10148\tA5\t4\t04\n" +
                "10149\tA5\t4\t05\n" +
                "10150\tA5\t4\t06\n" +
                "10151\tA6\t1\t01\n" +
                "10152\tA6\t3\t01\n" +
                "10153\tA6\t3\t03\n" +
                "10154\tA6\t3\t04\n" +
                "10155\tA6\t3\t05\n" +
                "10156\tA6\t3\t08\n" +
                "10157\tA6\t3\t11\n" +
                "10158\tA6\t3\t12\n" +
                "10159\tA6\t3\t15\n" +
                "10160\tA6\t3\t18\n" +
                "10161\tA6\t4\t01\n" +
                "10162\tA6\t4\t03\n" +
                "10163\tA6\t4\t04\n" +
                "10164\tA6\t4\t05\n" +
                "10165\tA6\t4\t08\n" +
                "10166\tA6\t4\t11\n" +
                "10167\tA6\t4\t12\n" +
                "10168\tA6\t4\t15\n" +
                "10169\tA6\t4\t18\n" +
                "10170\tA6\t5\t01\n" +
                "10171\tA6\t5\t02\n" +
                "10172\tA6\t5\t03\n" +
                "10173\tA6\t5\t08A\n" +
                "10174\tA6\t5\t08B\n" +
                "10175\tA1\t1\t02\n" +
                "10176\tA1\t1\t03\n" +
                "10177\tA1\t1\t04\n" +
                "10178\tA1\t1\t05\n" +
                "10179\tA1\t1\t07\n" +
                "10180\tA1\t1\t08\n" +
                "10181\tA1\t1\t09\n" +
                "10182\tA1\t1\t10\n" +
                "10183\tA1\t2\t02\n" +
                "10184\tA1\t2\t03\n" +
                "10185\tA1\t2\t04\n" +
                "10186\tA1\t2\t05\n" +
                "10187\tA1\t2\t07\n" +
                "10188\tA1\t2\t08\n" +
                "10189\tA1\t2\t09\n" +
                "10190\tA1\t2\t10\n" +
                "10191\tA1\t3\t02\n" +
                "10192\tA1\t3\t03\n" +
                "10193\tA1\t3\t04\n" +
                "10194\tA1\t3\t05\n" +
                "10195\tA1\t3\t07\n" +
                "10196\tA1\t3\t08\n" +
                "10197\tA1\t3\t09\n" +
                "10198\tA1\t3\t10\n" +
                "10199\tA1\t4\t02\n" +
                "10200\tA1\t4\t03\n" +
                "10201\tA1\t4\t04\n" +
                "10202\tA1\t4\t05\n" +
                "10203\tA1\t4\t08\n" +
                "10204\tA1\t4\t09\n" +
                "10205\tA1\t4\t10\n" +
                "10206\tA2\t1\t02\n" +
                "10207\tA2\t1\t03\n" +
                "10208\tA2\t1\t04\n" +
                "10209\tA2\t1\t05\n" +
                "10210\tA2\t1\t07\n" +
                "10211\tA2\t1\t09\n" +
                "10212\tA2\t1\t10\n" +
                "10213\tA2\t2\t02\n" +
                "10214\tA2\t2\t03\n" +
                "10215\tA2\t2\t04\n" +
                "10216\tA2\t2\t05\n" +
                "10217\tA2\t2\t07\n" +
                "10218\tA2\t2\t08\n" +
                "10219\tA2\t2\t09\n" +
                "10220\tA2\t2\t10\n" +
                "10221\tA2\t3\t02\n" +
                "10222\tA2\t3\t03\n" +
                "10223\tA2\t3\t04\n" +
                "10224\tA2\t3\t05\n" +
                "10225\tA2\t3\t07\n" +
                "10226\tA2\t3\t08\n" +
                "10227\tA2\t3\t09\n" +
                "10228\tA2\t3\t10\n" +
                "10229\tA2\t4\t02\n" +
                "10230\tA2\t4\t03\n" +
                "10231\tA2\t4\t04\n" +
                "10232\tA2\t4\t05\n" +
                "10233\tA2\t4\t08\n" +
                "10234\tA2\t4\t09\n" +
                "10235\tA2\t4\t10\n" +
                "10236\tA3\t1\t01\n" +
                "10237\tA3\t1\t02\n" +
                "10238\tA3\t1\t03\n" +
                "10239\tA3\t1\t04\n" +
                "10240\tA3\t1\t05\n" +
                "10241\tA3\t1\t08\n" +
                "10242\tA3\t1\t09\n" +
                "10243\tA3\t1\t10\n" +
                "10244\tA3\t2\t01\n" +
                "10245\tA3\t2\t02\n" +
                "10246\tA3\t2\t03\n" +
                "10247\tA3\t2\t04\n" +
                "10248\tA3\t2\t05\n" +
                "10249\tA3\t2\t08\n" +
                "10250\tA3\t2\t09\n" +
                "10251\tA3\t2\t10\n" +
                "10252\tA3\t3\t01\n" +
                "10253\tA3\t3\t02\n" +
                "10254\tA3\t3\t03\n" +
                "10255\tA3\t3\t04\n" +
                "10256\tA3\t3\t05\n" +
                "10257\tA3\t3\t08\n" +
                "10258\tA3\t3\t09\n" +
                "10259\tA3\t3\t10\n" +
                "10260\tA3\t4\t02\n" +
                "10261\tA3\t4\t03\n" +
                "10262\tA3\t4\t04\n" +
                "10263\tA3\t4\t09\n" +
                "10264\tA3\t4\t10\n" +
                "10265\tA4\t2\t01\n" +
                "10266\tA4\t2\t02\n" +
                "10267\tA4\t2\t03\n" +
                "10268\tA4\t2\t04\n" +
                "10269\tA4\t2\t05\n" +
                "10270\tA4\t2\t08\n" +
                "10271\tA4\t2\t09\n" +
                "10272\tA4\t2\t10\n" +
                "10273\tA4\t3\t01\n" +
                "10274\tA4\t3\t02\n" +
                "10275\tA4\t3\t03\n" +
                "10276\tA4\t3\t04\n" +
                "10277\tA4\t3\t05\n" +
                "10278\tA4\t3\t08\n" +
                "10279\tA4\t3\t09\n" +
                "10280\tA4\t3\t10\n" +
                "10281\tA4\t4\t01\n" +
                "10282\tA4\t4\t02\n" +
                "10283\tA4\t4\t03\n" +
                "10284\tA4\t4\t04\n" +
                "10285\tA4\t4\t05\n" +
                "10286\tA4\t4\t08\n" +
                "10287\tA4\t4\t09\n" +
                "10288\tA4\t4\t10\n" +
                "10289\tA5\t1\t01\n" +
                "10290\tA5\t1\t02\n" +
                "10291\tA5\t1\t03\n" +
                "10292\tA5\t1\t05\n" +
                "10293\tA5\t1\t07\n" +
                "10294\tA5\t1\t08\n" +
                "10295\tA5\t1\t09\n" +
                "10296\tA5\t1\t10\n" +
                "10297\tA5\t1\t11\n" +
                "10298\tA5\t1\t12\n" +
                "10299\tA5\t2\t01\n" +
                "10300\tA5\t2\t02\n" +
                "10301\tA5\t2\t03\n" +
                "10302\tA5\t2\t04\n" +
                "10303\tA5\t2\t05\n" +
                "10304\tA5\t2\t06\n" +
                "10305\tA5\t3\t01\n" +
                "10306\tA5\t3\t03\n" +
                "10307\tA5\t3\t04\n" +
                "10308\tA5\t3\t05\n" +
                "10309\tA5\t3\t06\n" +
                "10310\tA5\t4\t01\n" +
                "10311\tA5\t4\t03\n" +
                "10312\tA5\t4\t04\n" +
                "10313\tA5\t4\t05\n" +
                "10314\tA5\t4\t06\n" +
                "10315\tA6\t1\t01\n" +
                "10316\tA6\t3\t01\n" +
                "10317\tA6\t3\t03\n" +
                "10318\tA6\t3\t04\n" +
                "10319\tA6\t3\t05\n" +
                "10320\tA6\t3\t08\n" +
                "10321\tA6\t3\t11\n" +
                "10322\tA6\t3\t12\n" +
                "10323\tA6\t3\t15\n" +
                "10324\tA6\t3\t18\n" +
                "10325\tA6\t4\t01\n" +
                "10326\tA6\t4\t03\n" +
                "10327\tA6\t4\t04\n" +
                "10328\tA6\t4\t05\n" +
                "10329\tA6\t4\t08\n" +
                "10330\tA6\t4\t11\n" +
                "10331\tA6\t4\t12\n" +
                "10332\tA6\t4\t15\n" +
                "10333\tA6\t4\t18\n" +
                "10334\tA6\t5\t01\n" +
                "10335\tA6\t5\t02\n" +
                "10336\tA6\t5\t03\n" +
                "10337\tA6\t5\t08A\n" +
                "10338\tA6\t5\t08B\n";
        String replaceS = s.replaceAll("\n", "\t");
        String[] splitS = replaceS.split("\t");
        int len = splitS.length;
        for(int i = 0; i < len; i+=4){
            Classroom classroom = Classroom.builder()
                .id(Integer.valueOf(splitS[i]))
                .floor(splitS[i+2])
                .room(splitS[i+3]).build();
            classroom.setBuild(splitS[i+1]);
            classroomService.save(classroom);
        }
    }
}
