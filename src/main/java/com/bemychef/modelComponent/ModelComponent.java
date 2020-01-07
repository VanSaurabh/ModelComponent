package com.bemychef.modelComponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.bemychef.modelComponent")
public class ModelComponent 
{
    public static void main( String[] args ){
    	SpringApplication.run(ModelComponent.class, args);
    }
}
