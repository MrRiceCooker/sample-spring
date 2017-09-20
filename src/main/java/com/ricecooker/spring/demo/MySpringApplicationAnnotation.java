package com.ricecooker.spring.demo;

import com.ricecooker.spring.demo.log.LogEngine;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MySpringApplicationAnnotation {
    public static void main(String[] args) throws Exception {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AnnotationConfig.class);
        LogEngine log = context.getBean("consoleLogEngine", LogEngine.class);
        log.log("Hello Spring");
        context.close();
    }
}
