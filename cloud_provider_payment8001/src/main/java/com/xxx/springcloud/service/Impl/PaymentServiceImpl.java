package com.xxx.springcloud.service.Impl;


import com.xxx.springcloud.dao.PaymentDao;
import com.xxx.springcloud.entities.Payment;
import com.xxx.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * description:
 * author: xhs
 * date: 2022/4/10
 * version:
 **/
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
