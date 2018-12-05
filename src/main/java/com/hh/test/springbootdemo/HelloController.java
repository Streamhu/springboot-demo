package com.hh.test.springbootdemo;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * TODO
 *
 * @author huhui
 * @since 2018/12/4 11:33
 */
@RestController
public class HelloController {

    @Autowired
    private StudentProperties studentProperties;

    @ApiOperation(value="hello world示例", notes="第一个示例")
    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    public String hello(Model m) {
        System.out.println("姓名：" + studentProperties.getName() + " 年龄：" + studentProperties.getAge() );
        return "Hello Spring Boot";
    }
}