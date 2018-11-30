package com.itrjp.controller;

import com.itrjp.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by ren on 2018/11/30.
 */
@RestController
public class DcController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("dc")
    public String dc(){
        return consumerService.consumer();
    }
}
