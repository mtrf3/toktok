package com.ss.android.ugc.aweme.ecommerce.base.coupon;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CouponClaimSuccessEvent {

    @InterfaceC65349Pkn("voucher_list")
    public final String voucherList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CouponClaimSuccessEvent) && o.LJ(this.voucherList, ((CouponClaimSuccessEvent) obj).voucherList);
    }

    public final int hashCode() {
        String str = this.voucherList;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CouponClaimSuccessEvent(voucherList=");
        return q.LIZIZ(LIZ, this.voucherList, ')', LIZ);
    }

    public CouponClaimSuccessEvent(String str) {
        this.voucherList = str;
    }
}
