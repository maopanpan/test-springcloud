package com.test.springcloud.controller.sys;

import com.test.springcloud.controller.BaseController;
import com.test.springcloud.service.SystemService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * 类名称：SystemController<br>
 * 类描述：<br>
 * 创建时间：2018年04月24日<br>
 *
 * @author maopanpan
 * @version 1.0.0
 */
@RestController
@RequestMapping("/sys")
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
