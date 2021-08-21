package com.zhan.eshop.product.ha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试服务是否搭建成功
 * http://localhost:8081/hello?name=詹展
 *
 * @author zhanzhan
 * @date 2021/6/14 22:43
 */
@Controller
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String name) {
        return "hello, " + name;
    }
}
