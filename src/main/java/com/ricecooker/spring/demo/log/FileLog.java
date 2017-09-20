package com.ricecooker.spring.demo.log;

import java.io.*;

public class FileLog implements ILog {

    private BufferedWriter logWriter;
    private String logPath;

    public FileLog(String logPath) {
        this.logPath = logPath;
    }

    public void openLog() throws IOException {
        System.out.println("FileLog.openLog()");
        try {
            logWriter = new BufferedWriter(new FileWriter(logPath));
        } catch (IOException ex) {
            System.err.printf("Can't initial log file in this path [%s] \n", logPath);
            throw ex;
        }
    }

    public void log(String message) throws IOException {
        System.out.printf("FileLog.log(): %s\n", message);
        logWriter.write(message);
        logWriter.newLine();
    }

    public void closeLog() throws IOException {
        System.out.println("FileLog.closeLog()");
        logWriter.flush();
        logWriter.close();
    }
}
