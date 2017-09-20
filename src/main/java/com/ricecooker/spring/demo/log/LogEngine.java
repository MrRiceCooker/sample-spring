package com.ricecooker.spring.demo.log;

public class LogEngine {

    private ILog log;

    public LogEngine() {}

    public void setLog(ILog log){
        this.log = log;
    }

    public void log(String message) throws Exception {
        log.openLog();
        log.log(message);
        log.closeLog();
    }

}