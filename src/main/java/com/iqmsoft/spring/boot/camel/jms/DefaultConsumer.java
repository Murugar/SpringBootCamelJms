package com.iqmsoft.spring.boot.camel.jms;

import org.apache.camel.Body;
import org.apache.camel.Handler;
import org.springframework.stereotype.Component;


@Component("defaultConsumer")
public class DefaultConsumer {

    @Handler
    public void printDefaultMessage(@Body Object message) {
        System.out.println("Default Consumer Msg=" + message);
    }
}
