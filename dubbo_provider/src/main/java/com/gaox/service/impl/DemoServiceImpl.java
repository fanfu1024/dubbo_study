package com.gaox.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaox.service.DemoService;

/**
 * @Auther: gaox
 * @Date: 2019/3/21 14:46
 * @Description:
 */
@Service(version = "1.0.0",interfaceClass = DemoService.class)
public class DemoServiceImpl implements DemoService {
    @Override
    public String test(String name) {
        StringBuffer sb=new StringBuffer();
        sb.append("hello , this is "+name);
        return sb.toString();
    }
}
