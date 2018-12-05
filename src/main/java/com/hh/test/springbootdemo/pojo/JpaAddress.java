package com.hh.test.springbootdemo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * TODO
 *
 * @author huhui
 * @since 2018/12/5 10:50
 */
@Entity
public class JpaAddress {

    /**
     * 地址表id
     * */
    @Id
    @GeneratedValue
    private Long id;

    /**
     * 地址表城市
     * */
    @Column(nullable = false)
    private String city;

    /**
     * 地址表详情
     * */
    @Column(nullable = false)
    private String detail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
