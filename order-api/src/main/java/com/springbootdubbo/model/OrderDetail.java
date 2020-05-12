package com.springbootdubbo.model;

import java.io.Serializable;

/**
 * @Author: walking
 * @Date: 2019年9月12日
 */
public class OrderDetail implements Serializable {
    private int orderId;
    private int productId;
    private int productCount;

    public OrderDetail() {
    }

    public OrderDetail(int orderId, int productId, int productCount) {
        this.orderId = orderId;
        this.productId = productId;
        this.productCount = productCount;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getProductCount() {
        return productCount;
    }

    public void setProductCount(int productCount) {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "orderId=" + orderId +
                ", productId=" + productId +
                ", productCount=" + productCount +
                '}';
    }
}
