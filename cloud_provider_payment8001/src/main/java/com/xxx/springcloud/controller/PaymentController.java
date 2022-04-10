package com.xxx.springcloud.controller;


import com.xxx.springcloud.entities.CommonResult;
import com.xxx.springcloud.entities.Payment;
import com.xxx.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * description:
 * author: xhs
 * date: 2022/4/10
 * version:
 **/

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        log.info("插入结果: " + result);
        if(result > 0){
            return new CommonResult(200, "插入数据成功", result);
        }
        return new CommonResult(412, "插入数据失败", null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable("id") Long id){
        Payment paymentById = paymentService.getPaymentById(id);
        log.info("查询结果: " + paymentById);
        if(paymentById != null){
            return new CommonResult(200, "查询成功", paymentById);
        }
        return new CommonResult(412, "查询失败", null);
    }
}
