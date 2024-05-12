package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ContextProductInfo {

    @InterfaceC65349Pkn("id")
    public final String productId;

    @InterfaceC65349Pkn("seller_id")
    public final String sellerId;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextProductInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContextProductInfo)) {
            return false;
        }
        ContextProductInfo contextProductInfo = (ContextProductInfo) obj;
        return o.LJ(this.productId, contextProductInfo.productId) && o.LJ(this.sellerId, contextProductInfo.sellerId);
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sellerId;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ContextProductInfo(productId=");
        LIZ.append(this.productId);
        LIZ.append(", sellerId=");
        return q.LIZIZ(LIZ, this.sellerId, ')', LIZ);
    }

    public ContextProductInfo(String str, String str2) {
        this.productId = str;
        this.sellerId = str2;
    }

    public /* synthetic */ ContextProductInfo(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
