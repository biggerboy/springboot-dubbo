package com.consumer.controller;

import com.springbootdubbo.api.IOrderDetailService;
import com.springbootdubbo.model.OrderDetail;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: walking
 * @Date: 2019年9月12日
 */
@RestController
public class OrderDetailController {
    private Logger logger = LoggerFactory.getLogger(OrderDetailController.class);

    @Reference
    private IOrderDetailService orderDetailService;

    @GetMapping("/getOrderDetail")
    public List<OrderDetail> getOrderDetail(int orderId) {
        List<OrderDetail> orderDetail = orderDetailService.getOrderDetailByOrderId(orderId);
        logger.info("返回的数据:{}", orderDetail);
        return orderDetail;
    }
}
