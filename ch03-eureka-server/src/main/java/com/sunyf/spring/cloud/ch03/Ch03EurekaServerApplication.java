package com.sunyf.spring.cloud.ch03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Ch03EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Ch03EurekaServerApplication.class, args);
    }

}
