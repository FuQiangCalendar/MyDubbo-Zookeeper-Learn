package com.fuqiang.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.fuqiang.api.service.HelloService;

/**
 * @author FuQiangCalendar
 * @title: HelloServiceImpl
 * @projectName spring-dubbo-mydemo
 * @description: HelloService 实现类
 * @date 2021/9/14 17:25
 */
@Service //Dubbo 的Service注解 发布服务
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
