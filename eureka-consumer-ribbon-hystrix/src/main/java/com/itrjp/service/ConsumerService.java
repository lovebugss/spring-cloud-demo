package com.itrjp.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Created by ren on 2018/11/30.
 */
@Service
public class ConsumerService {
    @Resource
    public RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer(){
        return restTemplate.getForObject("http://eureka-client/dc",String.class);
    }
    public String fallback() {
        return "fallback";
    }
}
