package com.spring.cloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


/**
 * @author rice
 * @version 1.0
 * @date 2020/6/2 16:39
 */
@SpringBootApplication
@EnableEurekaClient
public class ServerProvider {
    public static void main(String[] args) {
        SpringApplication.run(ServerProvider.class);
    }

}
