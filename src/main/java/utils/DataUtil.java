package utils;

import entity.One;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataUtil {
    public static List<One> formXlsxString(String xlsxString){
        String[] split = xlsxString.split("\n");
        List<One> ones = new ArrayList<One>();

        for (String s : split) {
            One one = new One();
//            System.out.println(s);
            String[] split1 = s.split("\t");
            one.setName(split1[0]);
//            one.setGender(split1[1]);
            one.setNumber(split1[2]);
            one.setPinyin(split1[3]);
            ones.add(one);
        }
        return ones;
    }

    public static List<Map> getImgMsg(String fileMessage){
        String[] requesteds = fileMessage.split("images");
//        System.out.println(requesteds.length);
//        System.out.println(requesteds[0]);
        Map map = new HashMap();
        List<Map> maps = new ArrayList();
//        String down = "";
        String oneMessage = "";
        String name = "";
        String msg = "";
        for (int i = 1; i < requesteds.length; i++) {
            oneMessage = requesteds[i];
            name = oneMessage.substring(1,oneMessage.indexOf("."));
//            System.out.println(name);
//            System.out.println(oneMessage.indexOf("GSZJGX20"));
            msg = oneMessage.substring(oneMessage.indexOf("GSZJGX20"),oneMessage.indexOf("GSZJGX20")+16);
//            System.out.println(msg);
//            if (oneMessage.indexOf("ii*źgg")!=-1){
//                msg = oneMessage.substring(oneMessage.indexOf("ii*źgg"));
//            }else if(oneMessage.indexOf("ii-fiźeg")!=-1){
//                msg = oneMessage.substring(oneMessage.indexOf("ii-fiźeg"));
//            }
//            msg = msg.substring(msg.indexOf(":")+2);
//            msg = msg.substring(0,msg.indexOf("\\r"));
//            System.out.println(name);
//            System.out.println(msg);
//            System.out.println(requesteds[i]);
//            down = "";
//            requesteds[i]
//            map.put(requesteds[i].substring(1,requesteds[i].indexOf(".")),requesteds[i].substring(requesteds[i].indexOf("fiźeg")+7).substring(0,16));
            map.put(name,msg);
            maps.add(map);
        }
        return maps;
    }
}
