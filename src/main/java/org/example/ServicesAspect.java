package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class ServicesAspect {
    Logger logger = Logger.getLogger(this.getClass().getName());

    @Pointcut("execution(public * org.example.CalculatorService.*(..))")
    public void loggingPointcut(){}

    @Before("loggingPointcut()")
    public void logging (JoinPoint joinPoint){
        logger.log(Level.INFO, "ConsoleApplication method " + joinPoint.toString());
    }
}
