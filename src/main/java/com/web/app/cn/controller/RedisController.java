package com.web.app.cn.controller;

import com.web.app.cn.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * @author jon
 * @date 2021年08月21日 21:30
 */

@RestController
@RequestMapping(value = "app/v1")
public class RedisController {

    @Autowired
    private RedisUtil redisUtil;


    @GetMapping(value = "/redis/set/{string}")
    public String testSet(@PathVariable(value = "string") String string) {
        Date date = new Date();
        redisUtil.set(string, date.toString());
        return String.valueOf(redisUtil.get(string));
    }

    @GetMapping(value = "/redis/set/{key}/{value}")
    public String testSet(@PathVariable(value = "key") String key, @PathVariable(value = "value") String value) {
        redisUtil.set(key, value);
        return String.valueOf(redisUtil.get(key));
    }

    @GetMapping(value = "/redis/del/{string}")
    public String testDle(@PathVariable(value = "string") String string) {
        redisUtil.del(string);
        return "success";
    }

    @GetMapping(value = "/are/you/ready")
    public String test() {
        Map<String, String> PARAMS = new HashMap<String, String>(6, 1);
        return "are you ready";
    }
}
