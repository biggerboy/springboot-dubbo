package com.consumer.controller;

import com.consumer.service.OrderService;
import com.springbootdubbo.model.OrderDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: walking
 * @Date: 2019年9月12日
 */
@RestController
public class OrderDetailController {
    private Logger logger = LoggerFactory.getLogger(OrderService.class);
    @Autowired
    private OrderService orderService;
    @GetMapping("/getOrderDetail")
    public List<OrderDetail> getOrderDetail(int orderId){
        List<OrderDetail> orderDetail = orderService.getOrderDetail(orderId);
        logger.info("返回的数据:{}",orderDetail);
        return orderDetail;
    }
}
