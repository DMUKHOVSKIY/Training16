package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(RootConfiguration.class);
        ConsoleApplication application = (ConsoleApplication) applicationContext.getBean("consoleApplication");
        application.start();
    }
}
