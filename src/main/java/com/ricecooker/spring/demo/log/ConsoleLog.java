package com.ricecooker.spring.demo.log;

public class ConsoleLog implements ILog {

    public void openLog() {
        //do something to open log
        System.out.println("ConsoleLog.openLog()");
    }

    public void log(String message) {
        //do something to log
        System.out.printf("ConsoleLog.log(): [%s]\n", message);
    }

    public void closeLog() {
        //do something to close log
        System.out.println("ConsoleLog.closeLog()");
    }

}
