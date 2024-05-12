package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class PriceDaInfo {

    @InterfaceC65349Pkn("available_price")
    public final String availablePriceValue;

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("origin_price")
    public final String originPriceValue;

    /* JADX WARN: Multi-variable type inference failed */
    public PriceDaInfo() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PriceDaInfo)) {
            return false;
        }
        PriceDaInfo priceDaInfo = (PriceDaInfo) obj;
        return o.LJ(this.originPriceValue, priceDaInfo.originPriceValue) && o.LJ(this.availablePriceValue, priceDaInfo.availablePriceValue) && o.LJ(this.currency, priceDaInfo.currency);
    }

    public final int hashCode() {
        String str = this.originPriceValue;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.availablePriceValue;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PriceDaInfo(originPriceValue=");
        LIZ.append(this.originPriceValue);
        LIZ.append(", availablePriceValue=");
        LIZ.append(this.availablePriceValue);
        LIZ.append(", currency=");
        return q.LIZIZ(LIZ, this.currency, ')', LIZ);
    }

    public PriceDaInfo(String str, String str2, String str3) {
        this.originPriceValue = str;
        this.availablePriceValue = str2;
        this.currency = str3;
    }

    public /* synthetic */ PriceDaInfo(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
