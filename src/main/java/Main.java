import entity.One;
import org.apache.commons.lang3.StringUtils;
import utils.DataUtil;
import utils.FileUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void  main(String[] args) throws IOException {
//        FileUtil.mkdir("src/main/resources/test1");
//        FileUtil.mkdir("src/main/resources/test2");

//        FileUtil.copyFile(new File("src/main/resources/test1/test.html"),new File("src/main/resources/test2/test1Copy.html"));
//        FileUtil.copyFile("src/main/resources/test1/test.html","src/main/resources/test2/test1Copy2.html");

//        String str = FileUtil.getFileMessage("src/main/resources/test2/test1Copy.html");
//        System.out.println(str);

//        FileUtil.writeMassage("src/main/resources/test2/test1Copy2.html","aaaavas");

//        List<One> ones = DataUtil.formXlsxString("张晶晶\t女\t620503198603041628\t王占安\tzhangjingjing\n" +
//                "黄学鹏\t男\t622102198607208310\t王占安\thuangxuepeng\n" +
//                "魏家鹏\t男\t622123198611062053\t王占安\tweijiapeng\n" +
//                "秦坤\t男\t370921198904234290\t王占安\tqinkun\n" +
//                "李维佐\t男\t622921196908191835\t王占安\tliweizuo\n" +
//                "姚磊\t男\t622424198507271413\t王占安\tyaolei\n" +
//                "刘志民\t男\t622123199010120013\t王占安\tliuzhimin\n" +
//                "冯霭琳\t女\t620421199110170028\t王占安\tfengailin\n" +
//                "谷旭\t男\t623023197211230012\t王占安\tguxiu\n" +
//                "杨国军\t男\t620104197406280013\t王占安\tyangguojun\n" +
//                "杨瑞武\t男\t620524199106226310\t王占安\tyangruiwu\n" +
//                "彭焕丛\t男\t622825196808150315\t王占安\tpenghuancong\n" +
//                "张国璟\t男\t622925199003212012\t王占安\tzhangguojing\n" +
//                "员引辉\t男\t620422198406142714\t王占安\tyuanyinhui\n" +
//                "邓双军\t男\t622822199009100316\t王占安\tdengshuangjun\n" +
//                "刘继龙\t男\t622800199302081310\t王占安\tliujilong\n" +
//                "李小强\t男\t622628198401286779\t王占安\tlixiaoqiang\n" +
//                "杨兵\t男\t62220119840620235X\t王占安\tyangbing\n" +
//                "李晓霞\t女\t622427198305100949\t王占安\tlixiaoxia\n" +
//                "刘志华\t男\t62052419891105051X\t王占安\tliuzhihua\n" +
//                "李德明\t男\t622224198909105054\t王占安\tlideming\n" +
//                "刘伟\t男\t620422199001016415\t王占安\tliuwei\n" +
//                "徐帆\t男\t620102198707045836\t王占安\txufan\n" +
//                "贾建辉\t男\t622727199008133833\t王占安\tjiajianhui\n" +
//                "白涛\t男\t620102197409220312\t王占安\tbaitao\n" +
//                "张俊海\t男\t622428197204190019\t王占安\tzhangjunhai\n" +
//                "刘顶富\t男\t622428198409103913\t王占安\tliudingfu\n" +
//                "潘竞昌\t男\t620321199201031212\t王占安\tpanjingchang\n" +
//                "王朝霞\t女\t622726198905081227\t王占安\twangzhaoxia\n" +
//                "于瑞\t女\t622723199212202060\t王占安\tyurui\n" +
//                "常立国\t男\t622421199006284510\t王占安\tchangliguo\n" +
//                "王燕\t女\t622723198711221421\t王占安\twangyan\n" +
//                "殷通\t男\t622424198702051918\t王占安\tyintong\n" +
//                "于娟\t女\t410728199108290748\t王占安\tyujuan\n" +
//                "闫小军\t男\t620502198309262933\t王占安\tyanxiaojun\n" +
//                "刘娟喜\t女\t622727198412073225\t王占安\tliujuanxi\n" +
//                "张亚军\t男\t62242119650514501X\t王占安\tzhangyajun\n" +
//                "肖青海 \t男\t620121198402225018\t王占安\txiaoqinghai\n" +
//                "曹荣强\t男\t62272319880120043X\t王占安\tcaorongqiang\n" +
//                "马世栋\t男\t622326198603113738\t王占安\tmashidong\n" +
//                "李鑫\t男\t622224199206041511\t王占安\tlixin\n" +
//                "陈发海\t男\t622727197011164412\t王占安\tchenfahai\n" +
//                "何毅\t男\t512929197211143112\t王占安\theyi\n" +
//                "南军盈\t男\t620422197106110230\t王占安\tnanjunyin\n" +
//                "张维远\t男\t64222319820102167X\t王占安\tzhangweiyuan\n" +
//                "张继忠\t男\t623021199005251011\t王占安\tzhangjizhong\n" +
//                "何智鹏\t男\t640324197612093817\t王占安\thezhipeng\n" +
//                "冀鹏\t男\t622727198905165910\t王占安\tjipeng");
//        System.out.println(ones.get(0).getName());
//        System.out.println(ones.size());
//        System.out.println("start");
//        String fileMessage = FileUtil.getFileMessage("src/main/resources/test1/test.txt");
////        System.out.println(fileMessage);
//        List<Map> imgMsg = DataUtil.getImgMsg(fileMessage);
//        String[] requesteds = fileMessage.split("images");
//        System.out.println(requesteds.length);
//        System.out.println(requesteds[0]);
//        Map map = new HashMap();
//        List<Map<String,String>> maps = new ArrayList();
//        for (int i = 1; i < requesteds.length; i++) {
//            map.put(requesteds[i].substring(1,requesteds[i].indexOf(".")),requesteds[i].substring(requesteds[i].indexOf("fiźeg")+7).substring(0,16));
//            maps.add(map);
//        }
//        System.out.println("end");

//        FileUtil.mkdir("src/main/resources/run1");

        //获取所有人
        List<One> ones = DataUtil.formXlsxString("王建勇\t男\t622201198602106015\twangjianyonggg\n" +
                "赵建军\t男\t62210219730309521X\tzhaojianjungg\n" +
                "马永生\t男\t622102198007125212\tmayongshengg\n" +
                "刘少博\t男\t622421198910266412\tsunshaobo\n" +
                "王珏\t男\t620104198909171593\twangyugg\n" +
                "许桂花\t女\t622301198803206106\txuguihua\n" +
                "田琛\t女\t620502196907010040\ttiancheng\n" +
                "杨军\t男\t620502196808280010\tyangjungg\n" +
                "胡斌\t\t620102198210075837\thubinggg\n" +
                "代晓霞\t\t622201198301050628\tdaixiaoxia\n" +
                "段雷宾\t\t622201197803155118\tduanleibing");

        String fileMessage = FileUtil.getFileMessage("src/main/resources/test1/test.txt");
        List<Map> maps = DataUtil.getImgMsg(fileMessage);


        String path17 = "";
        String path18 = "";
        String path19 = "";
        String path20 = "";
        String msg17 = "";
        String msg18 = "";
        String msg19 = "";
        String msg20 = "";

        System.out.println(ones.size());


        for (One one : ones) {
            for (Map map : maps) {
                one.setCertificate17((String)map.get(one.getName()+"17"));
                one.setCertificate18((String)map.get(one.getName()+"18"));
                one.setCertificate19((String)map.get(one.getName()+"19"));
                one.setCertificate20((String)map.get(one.getName()+"20"));
            }
            System.out.println(one);


            FileUtil.mkdir("src/main/resources/run1/"+one.getName());

            path17 = "src/main/resources/run1/" + one.getName() + "/" + one.getPinyin() + "17.html";
            path18 = "src/main/resources/run1/" + one.getName() + "/" + one.getPinyin() + "18.html";
            path19 = "src/main/resources/run1/" + one.getName() + "/" + one.getPinyin() + "19.html";
            path20 = "src/main/resources/run1/" + one.getName() + "/" + one.getPinyin() + "20.html";

            FileUtil.copyFile("src/main/resources/test1/ankexiang17.html",path17);
            FileUtil.copyFile("src/main/resources/test1/ankexiang18.html",path18);
            FileUtil.copyFile("src/main/resources/test1/ankexiang19.html",path19);
            FileUtil.copyFile("src/main/resources/test1/ankexiang20.html",path20);

            msg17 = FileUtil.getFileMessage(path17);
            msg18 = FileUtil.getFileMessage(path18);
            msg19 = FileUtil.getFileMessage(path19);
            msg20 = FileUtil.getFileMessage(path20);

            msg17 = msg17.replace("GSZJGX2017431881",one.getCertificate17());
            msg18 = msg18.replace("GSZJGX2018888693",one.getCertificate18());
            msg19 = msg19.replace("GSZJGX2019167433",one.getCertificate19());
            msg20 = msg20.replace("GSZJGX2020714857",one.getCertificate20());
            msg17 = msg17.replace("安克祥",one.getName());
            msg17 = msg17.replace("622923199009073719",one.getNumber());
            msg18 = msg18.replace("安克祥",one.getName());
            msg18 = msg18.replace("622923199009073719",one.getNumber());
            msg19 = msg19.replace("安克祥",one.getName());
            msg19 = msg19.replace("622923199009073719",one.getNumber());
            msg20 = msg20.replace("安克祥",one.getName());
            msg20 = msg20.replace("622923199009073719",one.getNumber());

            FileUtil.writeMassage(path17,msg17);
            FileUtil.writeMassage(path18,msg18);
            FileUtil.writeMassage(path19,msg19);
            FileUtil.writeMassage(path20,msg20);
        }
    }
}
