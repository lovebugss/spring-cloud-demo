package com.itrjp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ren on 2018/11/29.
 */
@RestController
public class DcController {
    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/consumer")
    public String dc(){

        String forObject = restTemplate.getForObject("http://eureka-client/dc", String.class);
        return forObject;
    }
}
