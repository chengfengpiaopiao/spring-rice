package com.spring.cloud.consumer.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/2 20:28
 */
@RestController
@RequestMapping("consumer/")
public class ConsumerController {
    private final String url = "http://localhost:8081/provider/get";

    @RequestMapping("get")
    public String get(){
        RestTemplate template = new RestTemplate();
        String data = template.getForObject(url,String.class);
        return data;
    }

}
