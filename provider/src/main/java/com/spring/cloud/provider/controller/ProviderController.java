package com.spring.cloud.provider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rice
 * @version 1.0
 * @date 2020/6/2 16:48
 */

@RestController
@RequestMapping("provider")
public class ProviderController {

    @RequestMapping("get")
    public String  getData(){
        return "提供服务";
    }
}
