package com.xxx.springcloud.dao;

import com.xxx.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * description: DAO
 * author: xhs
 * date: 2022/4/10
 * version:
 **/

@Mapper
public interface PaymentDao {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
