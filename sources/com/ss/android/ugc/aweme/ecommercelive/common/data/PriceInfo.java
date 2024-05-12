package com.ss.android.ugc.aweme.ecommercelive.common.data;

import X.C79062V1e;
import X.HH1;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PriceInfo {

    @InterfaceC65349Pkn("available_price")
    public String availablePrice;

    @InterfaceC65349Pkn("currency")
    public String currency;

    @InterfaceC65349Pkn("display_style")
    public int displayStyle;

    @InterfaceC65349Pkn("origin_price")
    public String originPrice;

    @InterfaceC65349Pkn("price_prefix")
    public String pricePrefix;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceInfo)) {
            return false;
        }
        PriceInfo priceInfo = (PriceInfo) obj;
        return o.LJ(this.originPrice, priceInfo.originPrice) && o.LJ(this.availablePrice, priceInfo.availablePrice) && o.LJ(this.currency, priceInfo.currency) && this.displayStyle == priceInfo.displayStyle && o.LJ(this.pricePrefix, priceInfo.pricePrefix);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = (C79062V1e.LJ(this.currency, C79062V1e.LJ(this.availablePrice, this.originPrice.hashCode() * 31, 31), 31) + this.displayStyle) * 31;
        String str = this.pricePrefix;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PriceInfo(originPrice=");
        LIZ.append(this.originPrice);
        LIZ.append(", availablePrice=");
        LIZ.append(this.availablePrice);
        LIZ.append(", currency=");
        LIZ.append(this.currency);
        LIZ.append(", displayStyle=");
        LIZ.append(this.displayStyle);
        LIZ.append(", pricePrefix=");
        return q.LIZIZ(LIZ, this.pricePrefix, ')', LIZ);
    }

    public PriceInfo(String str, String str2, String str3, int i, String str4) {
        HH1.LIZ(str, "originPrice", str2, "availablePrice", str3, "currency");
        this.originPrice = str;
        this.availablePrice = str2;
        this.currency = str3;
        this.displayStyle = i;
        this.pricePrefix = str4;
    }
}
