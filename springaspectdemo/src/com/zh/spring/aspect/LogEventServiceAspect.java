package com.zh.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LogEventServiceAspect {
    @Pointcut("execution(* com.zh.spring.TaskInterface.executeTask(..))")
    public void executeTask(){};

    @Before("executeTask()")
    public void beforeExecuteTask() {
        System.out.println("Log info before executeTask.");
    }
    @After("executeTask()")
    public void afterExecuteTask() {
        System.out.println("Log info after executeTask.");
    }
    @AfterReturning("executeTask()")
    public void afterExecuteTaskReturn() {
        System.out.println("Log info after executeTask return.");
    }
    @AfterThrowing("executeTask()")
    public void afterExecuteTaskExcept() {
        System.out.println("Log info after executeTask throw exception.");
    }

    @Around("executeTask()")
    public void taskLogService(ProceedingJoinPoint pjp){
        try{
            System.out.println("Log info before executeTask.");
            pjp.proceed();
            System.out.println("Log info after executeTask.");
        }catch(Throwable t){
            System.out.println("Log info after executeTask throw exception.");
        }
    }

}
