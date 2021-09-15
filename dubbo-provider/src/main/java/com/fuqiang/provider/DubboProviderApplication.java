package com.fuqiang.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author FuQiangCalendar
 * @title: DubboProviderApplication
 * @projectName spring-dubbo-mydemo
 * @description: Dubbo Provider 模块启动入口
 * @date 2021/9/14 17:24
 */
@EnableDubbo
@SpringBootApplication
public class DubboProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }
}
