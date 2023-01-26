package com.motivity.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;


@Aspect
@EnableAspectJAutoProxy
public class BussinessLogicTracking {
    @Pointcut("execution(* BusinessLogic.*(..))")
    public void abcPointcut(){
    }
    @AfterReturning(pointcut = "abcPointcut()" ,returning = "result")
    public void myAdvic(JoinPoint jp, Object result)  {
        System.out.println("result is "+ result );


    }
}
