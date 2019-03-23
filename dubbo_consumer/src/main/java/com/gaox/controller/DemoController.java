package com.gaox.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gaox.service.DemoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: gaox
 * @Date: 2019/3/21 15:08
 * @Description:
 */
@RestController
public class DemoController {
    @Reference(version = "1.0.0",url = "dubbo://localhost:12345")
    private DemoService demoService;

    @PostMapping("/test")
    public String test(){
        return demoService.test("gaox");
    }
}
