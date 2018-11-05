package com.pattyq.producer.controller;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProducerController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/hello")
    public String hello(){
        String s = "" + discoveryClient.getServices();
        return s;
    }
}
