package com.bytedance.globalpayment.iap.model;

/* loaded from: classes14.dex */
public class AbsIapPricingPhase {
    public String mPrice;
    public long mPriceAmountMicros;
    public String mPriceCurrencyCode;

    public String getPrice() {
        return this.mPrice;
    }

    public long getPriceAmountMicros() {
        return this.mPriceAmountMicros;
    }

    public String getPriceCurrencyCode() {
        return this.mPriceCurrencyCode;
    }

    public AbsIapPricingPhase(String str, long j, String str2) {
        this.mPrice = str;
        this.mPriceAmountMicros = j;
        this.mPriceCurrencyCode = str2;
    }
}
