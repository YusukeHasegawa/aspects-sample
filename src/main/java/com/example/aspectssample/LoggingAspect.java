package com.example.aspectssample;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class LoggingAspect {

    @Around("execution(* com.example.aspectssample.*Service.*(..)) || execution(* org.springframework.util.StringUtils.quote(..))")
    public Object logging(ProceedingJoinPoint pj) throws Throwable {
        System.out.println("pj = [" + pj + "]");
        return pj.proceed();
    }
}
