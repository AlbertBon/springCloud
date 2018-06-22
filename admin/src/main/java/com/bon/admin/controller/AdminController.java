package com.bon.admin.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: admin
 * @description: 系统管理控制器
 * @author: Bon
 * @create: 2018-06-21 17:58
 **/
@RestController
public class AdminController {

    @RequestMapping("hello")
    public String index(){
        return "hello";
    }
}
