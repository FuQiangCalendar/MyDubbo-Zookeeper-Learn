package com.fuqiang.customer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.fuqiang.api.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @title
 * @description HelloController 消费者入口
 * @author FuQiangCalendar
 * @updateTime 2021/9/15 9:29
 * @throws
 */
@RestController
public class HelloController {
 
    @Reference //引用服务
    private HelloService helloService;
 
    @GetMapping("/sayHello")
    private String sayHello(@RequestParam String name){
 
        System.out.println("调用sayHello成功了..." + " name:" + name);
 
        return helloService.sayHello(name);
    }
 
}