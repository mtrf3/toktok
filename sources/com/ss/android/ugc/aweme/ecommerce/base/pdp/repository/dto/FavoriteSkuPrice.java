package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class FavoriteSkuPrice {

    @InterfaceC65349Pkn("currency")
    public final String currency;

    @InterfaceC65349Pkn("price_val")
    public final String price;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FavoriteSkuPrice)) {
            return false;
        }
        FavoriteSkuPrice favoriteSkuPrice = (FavoriteSkuPrice) obj;
        return o.LJ(this.price, favoriteSkuPrice.price) && o.LJ(this.currency, favoriteSkuPrice.currency);
    }

    public final int hashCode() {
        String str = this.price;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.currency;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FavoriteSkuPrice(price=");
        LIZ.append(this.price);
        LIZ.append(", currency=");
        return q.LIZIZ(LIZ, this.currency, ')', LIZ);
    }

    public FavoriteSkuPrice(String str, String str2) {
        this.price = str;
        this.currency = str2;
    }
}
