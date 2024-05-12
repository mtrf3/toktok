package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class DaInfo {

    @InterfaceC65349Pkn("coupon_type_info")
    public final String couponTypeInfo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DaInfo) && o.LJ(this.couponTypeInfo, ((DaInfo) obj).couponTypeInfo);
    }

    public final int hashCode() {
        String str = this.couponTypeInfo;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DaInfo(couponTypeInfo=");
        return q.LIZIZ(LIZ, this.couponTypeInfo, ')', LIZ);
    }

    public DaInfo(String str) {
        this.couponTypeInfo = str;
    }
}
