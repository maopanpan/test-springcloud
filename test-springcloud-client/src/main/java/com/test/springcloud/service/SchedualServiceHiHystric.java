package com.test.springcloud.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 类名称：SchedualServiceHiHystric<br>
 * 类描述：<br>
 * 创建时间：2018年04月24日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@Component
@Slf4j
public class SchedualServiceHiHystric implements SystemService {

    @Override
    public Object getSystemInfo(String msg) {
        LOGGER.error("请求异常进入断路器！");
        Map<String, Object> params = new HashMap<>();
        params.put("version", "1.0.0");
        params.put("msg", "请求异常进入断路器");
        return params;
    }
}
