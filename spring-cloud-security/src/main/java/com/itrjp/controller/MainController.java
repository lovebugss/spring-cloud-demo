package com.itrjp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by ren on 2018/12/5.
 */
@RestController
public class MainController {

    @GetMapping("welcome")
    public String welcome(){
        return "welcome";
    }
    @RequestMapping("user")
    public Principal user(Principal user){
        return user;
    }
}
