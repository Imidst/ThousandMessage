package utils;

import com.sun.deploy.util.StringUtils;
import org.apache.commons.lang3.ArrayUtils;
import java.io.*;
import java.util.ArrayList;

public class FileUtil {
    //创建文件夹
    public static void mkdir(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {//如果文件夹不存在
            file.mkdir();//创建文件夹
        }
    }

    //复制文件
    public static void copyFile(String from,String to) throws IOException {
        File source = new File(from);
        File dest = new File(to);
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) != -1) {
                output.write(buf, 0, bytesRead);
            }
        } finally {
            input.close();
            output.close();
        }
    }
//    public static void copyFile(File source, File dest) throws IOException {
//        InputStream input = null;
//        OutputStream output = null;
//        try {
//            input = new FileInputStream(source);
//            output = new FileOutputStream(dest);
//            byte[] buf = new byte[1024];
//            int bytesRead;
//            while ((bytesRead = input.read(buf)) != -1) {
//                output.write(buf, 0, bytesRead);
//            }
//        } finally {
//            input.close();
//            output.close();
//        }
//    }

    //读取文件数据
    public static String getFileMessage(String path) throws IOException {
        int num=0;
        char[] buf=new char[1024];
        StringBuffer message = new StringBuffer();
        //打开文件
        FileReader fr = new FileReader(path);
        //取出字符存到buf数组中
        while((num=fr.read(buf))!=-1) {
            //String(char[] cbuf,a,b),从cbuf的位置a开始取出连续的b个char组成字符串
            message.append(new String(buf,0,num));
        }
//        //检测一下是否取到相应的数据
//        for(int i=0;i<buf.length;i++) {
////            System.out.print(buf[i]);
//            message.append(buf[i]);
//        }
//        System.out.println();
        return message.toString();
    }

    //写入数据
    public static void writeMassage(String Path,String message) throws IOException {
        int number=1;
        OutputStream os = new FileOutputStream(Path);
        PrintWriter pw=new PrintWriter(os);
        pw.print(message);
//        for(int i=0;i<10;i++) {
//            String s=""+number;
//            //pw.println(s);//每输入一个数据，自动换行，便于我们每一行每一行地进行读取
//            pw.print(s+",");//不会自动换行，必要时可以自己添加分隔符
//            number++;
//        }
        pw.close();
        os.close();
    }
}
