package com.bytedance.android.live.wallet.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class CurrencyPriceItem extends F9E {

    @InterfaceC65349Pkn("currency")
    public String currency;

    @InterfaceC65349Pkn("keep_dot")
    public Integer keepDot;

    @InterfaceC65349Pkn("original_price")
    public Integer originalPrice;

    @InterfaceC65349Pkn("price")
    public Integer price;

    @InterfaceC65349Pkn("price_dot")
    public Integer priceDot;

    @InterfaceC65349Pkn("price_show_form")
    public String priceShowForm;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.currency;
        String str2 = this.priceShowForm;
        Integer num = this.price;
        Integer num2 = this.originalPrice;
        Integer num3 = this.priceDot;
        Integer num4 = this.keepDot;
        return new Object[]{str, str, str2, str2, num, num, num2, num2, num3, num3, num4, num4};
    }
}
