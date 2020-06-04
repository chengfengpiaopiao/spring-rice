package com.springcloud.config.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/3 22:31
 */
@RestController
@RefreshScope //开启更新功能
public class ClientTest {


//
    @RequestMapping("/hello")
    public String index(@RequestParam String name){
        return name+","+this.word;
    }


    @Autowired
    private Environment environment;

    @GetMapping(value = "/")
    public String hi(){
        Map<String,String> remoteCgfMap=new HashMap<>();
        remoteCgfMap.put("profileEnv", environment.getProperty("word"));
        remoteCgfMap.put("zwjSite", environment.getProperty("label"));
        remoteCgfMap.put("zwjSkills", environment.getProperty("ï»¿word"));
        remoteCgfMap.put("zwjMotto", environment.getProperty("zuowenjun.motto"));

        return "add";
    }

    @Value("${word}")
    public String word;
    @GetMapping(value = "/from")
    @ResponseBody
    public String test(){
        return word;
    }
}
