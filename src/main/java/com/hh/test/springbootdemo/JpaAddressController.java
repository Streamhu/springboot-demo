package com.hh.test.springbootdemo;

import com.hh.test.springbootdemo.Repository.JpaAddressRepository;
import com.hh.test.springbootdemo.pojo.JpaAddress;
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
 * @since 2018/12/4 11:33
 */
@RestController
public class JpaAddressController {

    @Autowired
    private JpaAddressRepository jpaAddressRepository;

    @ApiOperation(value="JPA示例", notes="测试jpa")
    @RequestMapping(value = "/jpaAddress", method= RequestMethod.GET)
    public List<JpaAddress> getByCity(String city) {
        List<JpaAddress> jpaAddressesList = jpaAddressRepository.findAddress(city);
        return jpaAddressesList;
    }
}