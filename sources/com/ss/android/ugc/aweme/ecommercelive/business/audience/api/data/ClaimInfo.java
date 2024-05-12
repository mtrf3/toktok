package com.ss.android.ugc.aweme.ecommercelive.business.audience.api.data;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class ClaimInfo {

    @InterfaceC65349Pkn("success_msg")
    public final String successMsg;

    @InterfaceC65349Pkn("voucher")
    public final VoucherInfo voucher;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClaimInfo)) {
            return false;
        }
        ClaimInfo claimInfo = (ClaimInfo) obj;
        return o.LJ(this.voucher, claimInfo.voucher) && o.LJ(this.successMsg, claimInfo.successMsg);
    }

    public final int hashCode() {
        VoucherInfo voucherInfo = this.voucher;
        int hashCode = (voucherInfo == null ? 0 : voucherInfo.hashCode()) * 31;
        String str = this.successMsg;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClaimInfo(voucher=");
        LIZ.append(this.voucher);
        LIZ.append(", successMsg=");
        return q.LIZIZ(LIZ, this.successMsg, ')', LIZ);
    }

    public ClaimInfo(VoucherInfo voucherInfo, String str) {
        this.voucher = voucherInfo;
        this.successMsg = str;
    }
}
