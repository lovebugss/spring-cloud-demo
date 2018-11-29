package com.itrjp.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by ren on 2018/11/29.
 */
@FeignClient("eureka-client")
public interface DcClient {
    @GetMapping("dc")
    String dc();
}
