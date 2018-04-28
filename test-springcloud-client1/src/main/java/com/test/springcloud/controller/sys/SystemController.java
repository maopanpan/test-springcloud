package com.test.springcloud.controller.sys;

import com.test.springcloud.controller.BaseController;
import com.test.springcloud.service.SystemService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类名称：SystemController<br>
 * 类描述：<br>
 * 创建时间：2018年04月24日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@RestController
@RequestMapping("/sys1")
public class SystemController extends BaseController {
    private final SystemService systemService;

    public SystemController(SystemService systemService) {
        this.systemService = systemService;
    }

    @GetMapping(value = "/getSystemInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object getSystemInfo(@RequestParam(value = "msg", required = true) String msg) {
        return systemService.getSystemInfo(msg);
    }
}
