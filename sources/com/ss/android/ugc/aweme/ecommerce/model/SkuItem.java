package com.ss.android.ugc.aweme.ecommerce.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class SkuItem {

    @InterfaceC65349Pkn("sku_id")
    public final String skuId;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SkuItem) && o.LJ(this.skuId, ((SkuItem) obj).skuId);
    }

    public final int hashCode() {
        String str = this.skuId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuItem(skuId=");
        return q.LIZIZ(LIZ, this.skuId, ')', LIZ);
    }

    public SkuItem(String str) {
        this.skuId = str;
    }
}
