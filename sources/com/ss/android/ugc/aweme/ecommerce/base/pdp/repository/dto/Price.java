package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Price {

    @InterfaceC65349Pkn("discount")
    public final String discount;

    @InterfaceC65349Pkn("discount_value")
    public final Float discountValue;

    @InterfaceC65349Pkn("max_price")
    public final String maxPrice;

    @InterfaceC65349Pkn("max_real_price")
    public final String maxRealPrice;

    @InterfaceC65349Pkn("min_price")
    public final String minPrice;

    @InterfaceC65349Pkn("min_real_price")
    public final String minRealPrice;

    @InterfaceC65349Pkn("price_prefix")
    public final String pricePrefix;

    @InterfaceC65349Pkn("style")
    public final Integer style;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return o.LJ(this.minPrice, price.minPrice) && o.LJ(this.maxPrice, price.maxPrice) && o.LJ(this.minRealPrice, price.minRealPrice) && o.LJ(this.maxRealPrice, price.maxRealPrice) && o.LJ(this.discount, price.discount) && o.LJ(this.discountValue, price.discountValue) && o.LJ(this.style, price.style) && o.LJ(this.pricePrefix, price.pricePrefix);
    }

    public final int hashCode() {
        String str = this.minPrice;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maxPrice;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.minRealPrice;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.maxRealPrice;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.discount;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.discountValue;
        int hashCode6 = (hashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num = this.style;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str6 = this.pricePrefix;
        return hashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Price(minPrice=");
        LIZ.append(this.minPrice);
        LIZ.append(", maxPrice=");
        LIZ.append(this.maxPrice);
        LIZ.append(", minRealPrice=");
        LIZ.append(this.minRealPrice);
        LIZ.append(", maxRealPrice=");
        LIZ.append(this.maxRealPrice);
        LIZ.append(", discount=");
        LIZ.append(this.discount);
        LIZ.append(", discountValue=");
        LIZ.append(this.discountValue);
        LIZ.append(", style=");
        LIZ.append(this.style);
        LIZ.append(", pricePrefix=");
        return q.LIZIZ(LIZ, this.pricePrefix, ')', LIZ);
    }

    public Price(String str, String str2, String str3, String str4, String str5, Float f, Integer num, String str6) {
        this.minPrice = str;
        this.maxPrice = str2;
        this.minRealPrice = str3;
        this.maxRealPrice = str4;
        this.discount = str5;
        this.discountValue = f;
        this.style = num;
        this.pricePrefix = str6;
    }
}
