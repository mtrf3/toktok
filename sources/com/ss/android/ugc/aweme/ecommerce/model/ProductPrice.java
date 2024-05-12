package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductPrice {

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("discount")
    public final String discount;

    @InterfaceC65349Pkn("original_price")
    public final String originalPrice;

    @InterfaceC65349Pkn("price_prefix")
    public final String pricePrefix;

    @InterfaceC65349Pkn("real_price")
    public final String realPrice;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductPrice() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPrice)) {
            return false;
        }
        ProductPrice productPrice = (ProductPrice) obj;
        return o.LJ(this.originalPrice, productPrice.originalPrice) && o.LJ(this.realPrice, productPrice.realPrice) && o.LJ(this.pricePrefix, productPrice.pricePrefix) && o.LJ(this.discount, productPrice.discount) && o.LJ(this.daInfo, productPrice.daInfo);
    }

    public final int hashCode() {
        String str = this.originalPrice;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.realPrice;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pricePrefix;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.discount;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.daInfo;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductPrice(originalPrice=");
        LIZ.append(this.originalPrice);
        LIZ.append(", realPrice=");
        LIZ.append(this.realPrice);
        LIZ.append(", pricePrefix=");
        LIZ.append(this.pricePrefix);
        LIZ.append(", discount=");
        LIZ.append(this.discount);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public ProductPrice(String str, String str2, String str3, String str4, String str5) {
        this.originalPrice = str;
        this.realPrice = str2;
        this.pricePrefix = str3;
        this.discount = str4;
        this.daInfo = str5;
    }

    public /* synthetic */ ProductPrice(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
