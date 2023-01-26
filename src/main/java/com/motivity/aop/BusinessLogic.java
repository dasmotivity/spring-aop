package com.motivity.aop;

import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BusinessLogic {
    public int method1(){
        System.out.println("method 1");
        return 1;
    }
    public int method2(){
        System.out.println("method 2");
        return 2;
    }
    public int method3(){
        System.out.println("method 3");
        return 3;
    }
    @PreDestroy
    public void preDestroy(){
        System.out.println("predestroy");
    }
    @PostConstruct
    public void postConstructor(){
        System.out.println("postConstructor");
    }
}
