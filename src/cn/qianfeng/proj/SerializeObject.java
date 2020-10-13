package cn.qianfeng.proj;

import java.io.*;

//序列化方法
public class SerializeObject {
   public static void SaveObject(Object object,String path) throws IOException {
       FileOutputStream fos = new FileOutputStream(path);
       ObjectOutputStream fis = new ObjectOutputStream(fos);
       fis.writeObject(object);
       fos.close();
       fis.close();
   }
//反序列化
    public static Object ReadProject(String path) throws IOException, ClassNotFoundException {
        FileInputStream fos = new FileInputStream(path);
        ObjectInputStream fis =new ObjectInputStream(fos);
        Object o =fis.readObject();
        fos.close();
        fis.close();
        return o;
    }

}
