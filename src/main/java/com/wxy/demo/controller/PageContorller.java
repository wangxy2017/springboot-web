package com.wxy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author wangxy
 * @Date 2019/6/20 23:30
 * @Description 页面跳转类
 **/
@Controller
public class PageContorller {

    /**
     * 首页
     *
     * @return
     */
    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
