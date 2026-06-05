package com.ruoyi.quartz.task;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component("myTask")
public class MyTask {

    public void printTime() {
        System.out.println( "定时任务执行" + LocalDateTime.now());
    }
}
