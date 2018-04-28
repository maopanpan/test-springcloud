package com.test.springcloud.controller.sys;

import com.test.springcloud.controller.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

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
@Slf4j
public class SystemController extends BaseController {

    @PostMapping(value = "getSystemInfo", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Object getSystemInfo(@RequestParam(value = "msg") String msg) {
        LOGGER.info("请参数为：" + msg);
        Map<String, Object> params = new HashMap<>();
        params.put("version", "1.0.0");
        params.put("msg", msg);
        return params;
    }
}
