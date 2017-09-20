package com.ricecooker.spring.demo.log;

public interface ILog {
    void openLog() throws Exception;
    void log(String message) throws Exception;
    void closeLog() throws Exception;
}
