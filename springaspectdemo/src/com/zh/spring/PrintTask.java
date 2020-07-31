package com.zh.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrintTask implements TaskInterface {

    @Autowired
    public PrintTask(){
    }

    @Override
    public void executeTask() {
        System.out.println("Execute Print TXT Task.");
    }
}
