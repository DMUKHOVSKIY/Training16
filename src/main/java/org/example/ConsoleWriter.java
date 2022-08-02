package org.example;

import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements Writer {
    @Override
    public void write (String message){
        System.out.println(message);
    }
}
