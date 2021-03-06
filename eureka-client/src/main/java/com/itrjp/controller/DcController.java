package com.itrjp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ren on 2018/11/28.
 */
@RestController
public class DcController {
    @Autowired
    public DiscoveryClient discoveryClient;
    @GetMapping("dc")
    public List<String> dc() throws InterruptedException {
        List<String> services = discoveryClient.getServices();
        System.out.println(services);
        return services;

    }
}
