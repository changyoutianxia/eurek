package com.ch.eurka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//开启eureka服务端
@EnableEurekaServer
public class EurkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurkaApplication.class, args);
    }

}

