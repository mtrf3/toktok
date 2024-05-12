package com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SkuInfo {

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuInfo)) {
            return false;
        }
        SkuInfo skuInfo = (SkuInfo) obj;
        return o.LJ(this.productId, skuInfo.productId) && o.LJ(this.skuId, skuInfo.skuId);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.skuId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuInfo(productId=");
        LIZ.append(this.productId);
        LIZ.append(", skuId=");
        return q.LIZIZ(LIZ, this.skuId, ')', LIZ);
    }

    public SkuInfo(String str, String str2) {
        this.productId = str;
        this.skuId = str2;
    }
}
