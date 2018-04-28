package com.test.springcloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 类名称：SystemService<br>
 * 类描述：<br>
 * 创建时间：2018年04月24日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@FeignClient(value = "test-springcloud-service", fallback = SchedualServiceHiHystric.class)
public interface SystemService {

    @RequestMapping(value = "/sys/getSystemInfo", method = RequestMethod.POST)
    public Object getSystemInfo(@RequestParam(value = "msg") String msg);
}
