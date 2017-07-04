package com.iqmsoft.spring.boot.camel.jms;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class DefaultProducer {

    @Autowired
    private ProducerTemplate producerTemplate;

    @Scheduled(cron = "15/15 * * * * *")
    public void createMessages() {
        System.out.println("sending default message...");
        producerTemplate.sendBody("activemq:defaultinvoices", "Bye Spring Camel World");
    }

}


