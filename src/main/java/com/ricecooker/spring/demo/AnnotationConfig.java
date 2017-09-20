package com.ricecooker.spring.demo;

import com.ricecooker.spring.demo.log.ConsoleLog;
import com.ricecooker.spring.demo.log.FileLog;
import com.ricecooker.spring.demo.log.ILog;
import com.ricecooker.spring.demo.log.LogEngine;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotationConfig {
    @Bean
    public String getLogPath(){
        return "c:\\temp\\temp.txt";
    }

    @Bean
    @Qualifier("fileLog")
    public FileLog getFileLog(String logPath){
        return new FileLog(logPath);
    }

    @Bean("fileLogEngine")
    public LogEngine getFileLogEngine(@Qualifier("fileLog") ILog fileLog){
        LogEngine log = new LogEngine();
        log.setLog(fileLog);
        return log;
    }
    
    @Bean
    @Qualifier("consoleLog")
    public ConsoleLog getConsoleLog(){
        return new ConsoleLog();
    }

    @Bean("consoleLogEngine")
    public LogEngine getConsoleLogEngine(@Qualifier("consoleLog") ILog consoleLog){
        LogEngine log = new LogEngine();
        log.setLog(consoleLog);
        return log;
    }
}