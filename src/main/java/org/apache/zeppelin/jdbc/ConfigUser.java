package org.apache.zeppelin.jdbc;

/**
 * @Auther: lijun.wen
 * @Date: 2019/1/18 16:28
 * @Description:
 */


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class ConfigUser {



    String configpath = "/data1/moji/soft/zeppelin-0.8.0-bin-all/conf/shiro.ini";

//    String configpath = "/Users/wlj/shiro.ini";
    private static Properties properties =new Properties();
    FileInputStream fis = null; // 读
    OutputStream fos ;


    public ConfigUser() {
        try {
            fis = new FileInputStream(configpath);
            properties.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getProperty(String key)
    {
        Object object = properties.get(key);
        return object.toString();
    }


    public static void main(String[] args) {
        ConfigUser conf = new ConfigUser();
        System.out.println(conf.getProperty("hadoop"));
        System.out.println(conf.getProperty("test"));


    }


}
