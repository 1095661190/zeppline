package org.apache.zeppelin.jdbc;

/**
 * @Auther: lijun.wen
 * @Date: 2019/1/18 16:28
 * @Description:
 */


import java.io.*;
import java.util.Properties;

public class ConfigUserTest {



    String configpath = "/Users/wlj/shiro.ini";

    private static Properties properties =new Properties();
    FileInputStream fis = null; // 读
    OutputStream fos ;


    public  ConfigUserTest() {
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
        ConfigUserTest conf = new ConfigUserTest();
        System.out.println(conf.getProperty("hadoop"));
        System.out.println(conf.getProperty("xiangyong.sun"));


    }


}
