package com.bytedance.globalpayment.iap.common.ability.model;

import X.C16880lQ;
import X.C77800Ug8;
import X.Q89;
import X.X1D;
import com.bytedance.globalpayment.iap.model.IapPaymentMethod;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class OrderInfo {
    public String mExtraPayload;
    public IapPaymentMethod mIapPaymentMethod;
    public String mOrderId;
    public String mProductId;
    public int mQuantity;
    public String mUserId;

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("productId", this.mProductId);
            jSONObject.put("orderId", this.mOrderId);
            jSONObject.put("userId", this.mUserId);
            jSONObject.put("extraPayload", this.mExtraPayload);
            jSONObject.put("paymentMethod", this.mIapPaymentMethod.channelName);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public OrderInfo() {
        this.mQuantity = 1;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OrderInfo{mProductId='");
        Q89.LIZIZ(LIZ, this.mProductId, '\'', ", mOrderId='");
        Q89.LIZIZ(LIZ, this.mOrderId, '\'', ", mUserId='");
        Q89.LIZIZ(LIZ, this.mUserId, '\'', ", mExtraPayload='");
        return C77800Ug8.LIZJ(LIZ, this.mExtraPayload, '\'', '}', LIZ);
    }

    public String getExtraPayload() {
        return this.mExtraPayload;
    }

    public IapPaymentMethod getIapPaymentMethod() {
        return this.mIapPaymentMethod;
    }

    public String getOrderId() {
        return this.mOrderId;
    }

    public String getProductId() {
        return this.mProductId;
    }

    public int getQuantity() {
        return this.mQuantity;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public OrderInfo(OrderData orderData) {
        this.mQuantity = 1;
        this.mProductId = orderData.getProductId();
        this.mOrderId = orderData.getOrderId();
        this.mUserId = orderData.getUserId();
        this.mExtraPayload = orderData.getIapPayRequest().LJIIJ;
        this.mIapPaymentMethod = orderData.getIapPaymentMethod();
        if (orderData.getAbsIapChannelOrderData() != null) {
            this.mQuantity = orderData.getAbsIapChannelOrderData().getQuantity();
        }
    }

    public OrderInfo setExtraPayload(String str) {
        this.mExtraPayload = str;
        return this;
    }

    public OrderInfo setIapPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        this.mIapPaymentMethod = iapPaymentMethod;
        return this;
    }

    public OrderInfo setOrderId(String str) {
        this.mOrderId = str;
        return this;
    }

    public OrderInfo setProductId(String str) {
        this.mProductId = str;
        return this;
    }

    public OrderInfo setQuantity(int i) {
        this.mQuantity = i;
        return this;
    }

    public OrderInfo setUserId(String str) {
        this.mUserId = str;
        return this;
    }
}
