package com.bytedance.globalpayment.iap.model;

import com.bytedance.globalpayment.iap.model.enums.OrderStateEnum;

/* loaded from: classes14.dex */
public class OrderStateInfo {
    public String orderId;
    public OrderStateEnum orderState;
    public String productId;

    public String getOrderId() {
        return this.orderId;
    }

    public OrderStateEnum getOrderState() {
        return this.orderState;
    }

    public String getProductId() {
        return this.productId;
    }

    public OrderStateInfo setOrderId(String str) {
        this.orderId = str;
        return this;
    }

    public OrderStateInfo setOrderState(OrderStateEnum orderStateEnum) {
        this.orderState = orderStateEnum;
        return this;
    }

    public OrderStateInfo setProductId(String str) {
        this.productId = str;
        return this;
    }
}
