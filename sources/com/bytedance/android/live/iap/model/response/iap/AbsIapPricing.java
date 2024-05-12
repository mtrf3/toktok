package com.bytedance.android.live.iap.model.response.iap;

import X.InterfaceC65349Pkn;

/* loaded from: classes.dex */
public abstract class AbsIapPricing {

    @InterfaceC65349Pkn("price")
    public String price;

    @InterfaceC65349Pkn("priceAmountMicros")
    public long priceAmountMicros;

    @InterfaceC65349Pkn("priceCurrencyCode")
    public String priceCurrencyCode;

    public AbsIapPricing(String str, long j, String str2) {
        this.price = str;
        this.priceAmountMicros = j;
        this.priceCurrencyCode = str2;
    }
}
