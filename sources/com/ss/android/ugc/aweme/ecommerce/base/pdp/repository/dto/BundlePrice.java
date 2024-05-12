package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class BundlePrice {

    @InterfaceC65349Pkn("discount")
    public final String discount;

    @InterfaceC65349Pkn("original_price")
    public final String originalPrice;

    @InterfaceC65349Pkn("price_prefix")
    public final String pricePrefix;

    @InterfaceC65349Pkn("real_price")
    public final String realPrice;

    @InterfaceC65349Pkn("save_price")
    public final String savePrice;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BundlePrice)) {
            return false;
        }
        BundlePrice bundlePrice = (BundlePrice) obj;
        return o.LJ(this.originalPrice, bundlePrice.originalPrice) && o.LJ(this.realPrice, bundlePrice.realPrice) && o.LJ(this.discount, bundlePrice.discount) && o.LJ(this.savePrice, bundlePrice.savePrice) && o.LJ(this.pricePrefix, bundlePrice.pricePrefix);
    }

    public final int hashCode() {
        String str = this.originalPrice;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.realPrice;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.discount;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.savePrice;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.pricePrefix;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BundlePrice(originalPrice=");
        LIZ.append(this.originalPrice);
        LIZ.append(", realPrice=");
        LIZ.append(this.realPrice);
        LIZ.append(", discount=");
        LIZ.append(this.discount);
        LIZ.append(", savePrice=");
        LIZ.append(this.savePrice);
        LIZ.append(", pricePrefix=");
        return q.LIZIZ(LIZ, this.pricePrefix, ')', LIZ);
    }

    public BundlePrice(String str, String str2, String str3, String str4, String str5) {
        this.originalPrice = str;
        this.realPrice = str2;
        this.discount = str3;
        this.savePrice = str4;
        this.pricePrefix = str5;
    }
}
