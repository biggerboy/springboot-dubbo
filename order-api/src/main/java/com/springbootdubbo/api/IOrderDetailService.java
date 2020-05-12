package com.springbootdubbo.api;

import com.springbootdubbo.model.OrderDetail;

import java.util.List;

/**
 * @Author: walking
 * @Date: 2019年9月12日
 */
public interface IOrderDetailService {
    /**
     * 根据订单ID查询订单详情
     * @param orderId
     * @return
     */
    List<OrderDetail> getOrderDetailByOrderId(int orderId);
}
