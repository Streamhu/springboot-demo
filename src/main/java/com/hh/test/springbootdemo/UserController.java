package com.hh.test.springbootdemo;

import com.hh.test.springbootdemo.mapper.UserMapper;
import com.hh.test.springbootdemo.pojo.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * TODO
 *
 * @author huhui
 * @since 2018/12/4 16:33
 */
@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @ApiOperation(value="获取用户列表", notes="测试用的")
    @RequestMapping(value = "/listUser",  method= RequestMethod.GET)
    public List<User> listStudent() {
        List<User> userList = userMapper.findAll();
        for(User user : userList){
            System.out.println("name=" + user.getName());
        }
        return userList;
    }

}
