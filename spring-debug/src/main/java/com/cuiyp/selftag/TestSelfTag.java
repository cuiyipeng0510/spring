package com.cuiyp.selftag;

import com.cuiyp.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class TestSelfTag {
    public static void main(String[] args) {
        ApplicationContext context = new MyClassPathXmlApplicationContext("selftag.xml");
        User user=(User)context.getBean("testbean");
        System.out.println("username:"+user.getUsername()+"  "+"email:"+user.getEmail());
    }
}
