package com.motivity.aop;

import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


public class BeanInitializationInJava {
    @Bean
    public BusinessLogic getBussinessLogic(){
        return new BusinessLogic();
    }
//    @Bean
//    public AnnotationAwareAspectJAutoProxyCreator getAnnotationAwareAspectJAutoProxyCreator(){
//        return new AnnotationAwareAspectJAutoProxyCreator();
//    }
    @Bean
    public BussinessLogicTracking  getBussinessLogicTracking(){
        return new BussinessLogicTracking();
    }
}
