package com.lumor.interceptor.handlerinterceptor.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: Administrator
 * @Date: 2019/4/21 0021 09:42
 * @Description:
 */
@RestController
public class RestDemoController {

    @RequestMapping("index")
    public  String index(){
        return "hello world";
    }
}
