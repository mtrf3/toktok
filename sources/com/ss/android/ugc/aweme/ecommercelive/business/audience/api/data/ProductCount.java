package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ProductCount {

    @InterfaceC65349Pkn("total")
    public final Integer total;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductCount() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductCount) && o.LJ(this.total, ((ProductCount) obj).total);
    }

    public final int hashCode() {
        Integer num = this.total;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductCount(total=");
        return s0.LIZJ(LIZ, this.total, ')', LIZ);
    }

    public ProductCount(Integer num) {
        this.total = num;
    }

    public /* synthetic */ ProductCount(Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num);
    }
}
