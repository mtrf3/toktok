package com.bytedance.globalpayment.iap.common.ability.model.api.entity;

import android.text.TextUtils;

/* loaded from: classes14.dex */
public class ResponseEntity {

    @JsonName("error_code")
    public int errorCode;

    @JsonName("message")
    public String message;
    public String orderId;

    public boolean isSuccess() {
        if (this.errorCode == 0 && TextUtils.equals("success", this.message)) {
            return true;
        }
        return false;
    }

    public boolean isFailure() {
        return !isSuccess();
    }

    public String getOrderId() {
        return this.orderId;
    }

    public ResponseEntity setOrderId(String str) {
        this.orderId = str;
        return this;
    }
}
