package com.nokavietnam.nokaimageservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class NokaImageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NokaImageServiceApplication.class, args);
    }

}
