package com.bytedance.globalpayment.iap.model;

import X.V0N;

/* loaded from: classes14.dex */
public enum IapPaymentMethod {
    GOOGLE("GP"),
    AMAZON("amazon"),
    UNKNOWN("UNKNOWN");

    public final String channelName;

    public static IapPaymentMethod valueOf(String str) {
        return (IapPaymentMethod) V0N.LJJJ(IapPaymentMethod.class, str);
    }

    IapPaymentMethod(String str) {
        this.channelName = str;
    }
}
