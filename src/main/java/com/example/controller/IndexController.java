package com.example.controller;

import com.example.entity.Log;
import com.example.service.LogService;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * Created by gaoyibing on 2017/6/2.
 */
@Controller
public class IndexController {
    @Value("${abc}")
    String abc;

    @Autowired
    private LogService LogService;

    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "Hello World!  =>"+abc;
    }

    @RequestMapping("/index")
    public String index() {
        return "/index";
    }


    @RequestMapping("/hive")
    public String index(Model model) {
        Map<String, Object> map = Maps.newHashMap();
        map.put("systemName", "qy");
        List<Log> LogList = LogService.selectByMap(map);
        model.addAttribute("LogList", LogList);
        return "/index";
    }
}
