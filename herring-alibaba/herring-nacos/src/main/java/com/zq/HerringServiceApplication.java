package com.zq;

import com.alibaba.nacos.api.annotation.NacosProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
//@EnableAutoConfiguration
public class HerringServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(HerringServiceApplication.class, args);
    }
}
