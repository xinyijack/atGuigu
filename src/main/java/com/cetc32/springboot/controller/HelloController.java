package com.cetc32.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright(C),2019-2020,CETC-32
 * FileName:HelloController
 * Author:  xinyijie
 * Date:    2020/10/1410:37
 * Describtion:hello
 * History:
 * <author>    <time>    <version>    <desc>
 */
@RestController
public class HelloController {

    @Value("${person.last-name}")
    private String name;

    @RequestMapping("/sayHello")
    public String sayHello(){
        return "Hello " + name;
    }
}
