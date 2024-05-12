package com.bytedance.android.live.wallet.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class CustomizedDiamond extends F9E {

    @InterfaceC65349Pkn("coupon_id")
    public String couponId;

    @InterfaceC65349Pkn("describe")
    public String describe;

    @InterfaceC65349Pkn("diamond_count_rate")
    public Float diamondCountRate;

    @InterfaceC65349Pkn("giving_count")
    public Integer givingCount;

    @InterfaceC65349Pkn("id")
    public Long id;

    @InterfaceC65349Pkn("price_max")
    public Integer priceMax;

    @InterfaceC65349Pkn("price_min")
    public Integer priceMin;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.id;
        Integer num = this.priceMin;
        Integer num2 = this.priceMax;
        Float f = this.diamondCountRate;
        Integer num3 = this.givingCount;
        String str = this.describe;
        String str2 = this.couponId;
        return new Object[]{l, l, num, num, num2, num2, f, f, num3, num3, str, str, str2, str2};
    }
}
