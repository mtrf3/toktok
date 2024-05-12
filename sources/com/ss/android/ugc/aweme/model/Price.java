package com.ss.android.ugc.aweme.model;

import X.C1NE;
import X.C43588H8u;
import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class Price implements Serializable {

    @InterfaceC65349Pkn("discount_list")
    public final List<Price> discountList;

    @InterfaceC65349Pkn("estimated_earnings_in_local_currency")
    public final String estimatedEarningsInLocalCurrency;

    @InterfaceC65349Pkn("estimated_earnings_in_usd")
    public final String estimatedEarningsInUsd;

    @InterfaceC65349Pkn("price_in_local_currency")
    public final String priceInLocalCurrency;

    @InterfaceC65349Pkn("price_in_usd")
    public final String priceInUsd;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Price copy$default(Price price, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = price.priceInUsd;
        }
        if ((i & 2) != 0) {
            str2 = price.priceInLocalCurrency;
        }
        if ((i & 4) != 0) {
            str3 = price.estimatedEarningsInUsd;
        }
        if ((i & 8) != 0) {
            str4 = price.estimatedEarningsInLocalCurrency;
        }
        if ((i & 16) != 0) {
            list = price.discountList;
        }
        return price.copy(str, str2, str3, str4, list);
    }

    public final Price copy(String priceInUsd, String priceInLocalCurrency, String estimatedEarningsInUsd, String estimatedEarningsInLocalCurrency, List<Price> list) {
        o.LJIIIZ(priceInUsd, "priceInUsd");
        o.LJIIIZ(priceInLocalCurrency, "priceInLocalCurrency");
        o.LJIIIZ(estimatedEarningsInUsd, "estimatedEarningsInUsd");
        o.LJIIIZ(estimatedEarningsInLocalCurrency, "estimatedEarningsInLocalCurrency");
        return new Price(priceInUsd, priceInLocalCurrency, estimatedEarningsInUsd, estimatedEarningsInLocalCurrency, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Price)) {
            return false;
        }
        Price price = (Price) obj;
        return o.LJ(this.priceInUsd, price.priceInUsd) && o.LJ(this.priceInLocalCurrency, price.priceInLocalCurrency) && o.LJ(this.estimatedEarningsInUsd, price.estimatedEarningsInUsd) && o.LJ(this.estimatedEarningsInLocalCurrency, price.estimatedEarningsInLocalCurrency) && o.LJ(this.discountList, price.discountList);
    }

    public int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.estimatedEarningsInLocalCurrency, C79062V1e.LJ(this.estimatedEarningsInUsd, C79062V1e.LJ(this.priceInLocalCurrency, this.priceInUsd.hashCode() * 31, 31), 31), 31);
        List<Price> list = this.discountList;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return LJ + hashCode;
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Price(priceInUsd=");
        LIZ.append(this.priceInUsd);
        LIZ.append(", priceInLocalCurrency=");
        LIZ.append(this.priceInLocalCurrency);
        LIZ.append(", estimatedEarningsInUsd=");
        LIZ.append(this.estimatedEarningsInUsd);
        LIZ.append(", estimatedEarningsInLocalCurrency=");
        LIZ.append(this.estimatedEarningsInLocalCurrency);
        LIZ.append(", discountList=");
        return C1NE.LIZIZ(LIZ, this.discountList, ')', LIZ);
    }

    public final List<Price> getDiscountList() {
        return this.discountList;
    }

    public final String getEstimatedEarningsInLocalCurrency() {
        return this.estimatedEarningsInLocalCurrency;
    }

    public final String getEstimatedEarningsInUsd() {
        return this.estimatedEarningsInUsd;
    }

    public final String getPriceInLocalCurrency() {
        return this.priceInLocalCurrency;
    }

    public final String getPriceInUsd() {
        return this.priceInUsd;
    }

    public Price(String str, String str2, String str3, String str4, List<Price> list) {
        C43588H8u.LIZLLL(str, "priceInUsd", str2, "priceInLocalCurrency", str3, "estimatedEarningsInUsd", str4, "estimatedEarningsInLocalCurrency");
        this.priceInUsd = str;
        this.priceInLocalCurrency = str2;
        this.estimatedEarningsInUsd = str3;
        this.estimatedEarningsInLocalCurrency = str4;
        this.discountList = list;
    }

    public /* synthetic */ Price(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? null : list);
    }
}
