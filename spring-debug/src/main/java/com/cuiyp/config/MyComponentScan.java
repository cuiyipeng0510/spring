package com.cuiyp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("com.cuiyp.selftag")
public class MyComponentScan {

    @ComponentScan("com.cuiyp.selftag")
    @Configuration
    @Order(90)
    class InnerClass{

    }

}
