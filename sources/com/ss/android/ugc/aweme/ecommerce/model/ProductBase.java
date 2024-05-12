package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductBase {

    @InterfaceC65349Pkn("da_info")
    public final String daInfo;

    @InterfaceC65349Pkn("price")
    public final ProductPrice price;

    @InterfaceC65349Pkn("sold_count")
    public final Integer soldCount;

    @InterfaceC65349Pkn("sold_text_info")
    public final ShowTextInfo soldTextInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductBase() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBase)) {
            return false;
        }
        ProductBase productBase = (ProductBase) obj;
        return o.LJ(this.price, productBase.price) && o.LJ(this.soldCount, productBase.soldCount) && o.LJ(this.soldTextInfo, productBase.soldTextInfo) && o.LJ(this.daInfo, productBase.daInfo);
    }

    public final int hashCode() {
        ProductPrice productPrice = this.price;
        int hashCode = (productPrice == null ? 0 : productPrice.hashCode()) * 31;
        Integer num = this.soldCount;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        ShowTextInfo showTextInfo = this.soldTextInfo;
        int hashCode3 = (hashCode2 + (showTextInfo == null ? 0 : showTextInfo.hashCode())) * 31;
        String str = this.daInfo;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductBase(price=");
        LIZ.append(this.price);
        LIZ.append(", soldCount=");
        LIZ.append(this.soldCount);
        LIZ.append(", soldTextInfo=");
        LIZ.append(this.soldTextInfo);
        LIZ.append(", daInfo=");
        return q.LIZIZ(LIZ, this.daInfo, ')', LIZ);
    }

    public ProductBase(ProductPrice productPrice, Integer num, ShowTextInfo showTextInfo, String str) {
        this.price = productPrice;
        this.soldCount = num;
        this.soldTextInfo = showTextInfo;
        this.daInfo = str;
    }

    public /* synthetic */ ProductBase(ProductPrice productPrice, Integer num, ShowTextInfo showTextInfo, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : productPrice, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : showTextInfo, (i & 8) != 0 ? null : str);
    }
}
