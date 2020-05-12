package com.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.springbootdubbo.api.IOrderDetailService;
import com.springbootdubbo.model.OrderDetail;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: walking
 * @Date: 2019年9月12日
 */
@Service
public class OrderService {
    @Reference(timeout = 1500)
    private IOrderDetailService orderDetailService;
    public List<OrderDetail> getOrderDetail(int orderId){
        List<OrderDetail> orderDetails = orderDetailService.getOrderDetailByOrderId(orderId);
        return orderDetails;
    }
}
