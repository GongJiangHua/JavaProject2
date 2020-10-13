package cn.qianfeng.proj;

import java.io.IOException;
import java.io.Serializable;

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Node n = new Node("龚江华","1013");
        String path = "C:\\Users\\GJH20000127\\Desktop\\存储文件\\1013晚上.txt";
        SerializeObject.SaveObject(n,path);
        //SerializeObject.ReadProject(path);
    }
}
