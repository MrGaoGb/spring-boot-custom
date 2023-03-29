package com.mrgao.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Mr.Gao
 * @date 2023/3/29 17:47
 * @apiNote:
 */
@RestController
@RequestMapping("/custom")
public class UserController {


    @GetMapping("/boot")
    public String getCustomMsg(){
        return "Custom Spring Boot";
    }
}
