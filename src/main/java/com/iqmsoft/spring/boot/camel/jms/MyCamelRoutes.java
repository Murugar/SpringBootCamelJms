package com.iqmsoft.spring.boot.camel.jms;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyCamelRoutes extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:invoices").
        to("bean:printConsumer", "mock:printConsumer");
        
        from("activemq:defaultinvoices").
        to("bean:defaultConsumer");
    }
}
