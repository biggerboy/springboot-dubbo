package com.springbootdubbo.api;

import com.springbootdubbo.model.OrderDetail;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: walking
 * @Date: 2019年9月12日
 */
@Service
public class OrderDetailService implements IOrderDetailService{
    private Logger logger = LoggerFactory.getLogger(OrderDetailService.class);
    @Override
    public List<OrderDetail> getOrderDetailByOrderId(int orderId) {
        logger.info("orderId:{}",orderId);
        try {
            //测试consumer超时
            Thread.sleep(orderId);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(),e);
        }
        //模拟数据库查询商品详情
        List<OrderDetail> list = new ArrayList<>();
        list.add(new OrderDetail(orderId,21,2));
        list.add(new OrderDetail(orderId,23,1));
        return list;
    }
}
