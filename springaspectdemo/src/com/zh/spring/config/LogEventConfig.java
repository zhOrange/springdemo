package com.zh.spring.config;

import com.zh.spring.PrintTask;
import com.zh.spring.TaskInterface;
import com.zh.spring.aspect.LogEventServiceAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class LogEventConfig {
    @Bean
    public LogEventServiceAspect logEventServiceAspect(){
        return new LogEventServiceAspect();
    }
    @Bean
    public TaskInterface taskInterface(){
        return new PrintTask();
    }
}
