package com.yzw.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yzw on 2017/12/20.
 */
@RequestMapping(value = "/test", method = RequestMethod.GET)
@Controller
public class MainController {
    public String test(){
//        实际返回的是views/test.jsp ,spring-mvc.xml中配置过前后缀
        System.out.println("test");
        return "tesssst";
    }

}
