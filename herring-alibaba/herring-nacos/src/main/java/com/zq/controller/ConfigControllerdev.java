package com.zq.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
@RequestMapping("/config1")
public class ConfigControllerdev {

    @Value("${mine.name:none}")
    private String name;
    @Value("${mine.age:0}")
    private String age;

    @RequestMapping("/get")
    public String get() {
        return name + ": " + age;
    }

}
