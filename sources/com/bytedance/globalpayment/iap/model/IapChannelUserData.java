package com.bytedance.globalpayment.iap.model;

/* loaded from: classes14.dex */
public class IapChannelUserData {
    public IapPaymentMethod mIapPaymentMethod;
    public String mUserId;
    public String mUserMarkPlace;

    public IapPaymentMethod getIapPaymentMethod() {
        return this.mIapPaymentMethod;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public String getUserMarkPlace() {
        return this.mUserMarkPlace;
    }

    public IapChannelUserData setIapPaymentMethod(IapPaymentMethod iapPaymentMethod) {
        this.mIapPaymentMethod = iapPaymentMethod;
        return this;
    }

    public IapChannelUserData setUserId(String str) {
        this.mUserId = str;
        return this;
    }

    public IapChannelUserData setUserMarkPlace(String str) {
        this.mUserMarkPlace = str;
        return this;
    }

    public IapChannelUserData(IapPaymentMethod iapPaymentMethod, String str, String str2) {
        this.mIapPaymentMethod = iapPaymentMethod;
        this.mUserId = str;
        this.mUserMarkPlace = str2;
    }
}
