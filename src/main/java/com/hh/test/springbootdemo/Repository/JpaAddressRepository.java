package com.hh.test.springbootdemo.Repository;

import com.hh.test.springbootdemo.pojo.JpaAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * TODO
 *
 * @author huhui
 * @since 2018/12/5 10:59
 */
public interface JpaAddressRepository extends JpaRepository<JpaAddress, Long> {

    @Query("from JpaAddress j where j.city=:city")
    List<JpaAddress> findAddress(@Param("city") String city);

}
