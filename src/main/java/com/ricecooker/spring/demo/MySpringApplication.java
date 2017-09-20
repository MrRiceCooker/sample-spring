package com.ricecooker.spring.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ricecooker.spring.demo.log.LogEngine;

public class MySpringApplication {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application.xml");
        LogEngine log = context.getBean("consoleLogEngine", LogEngine.class);
        log.log("Hello Spring");
        context.close();
    }
}
