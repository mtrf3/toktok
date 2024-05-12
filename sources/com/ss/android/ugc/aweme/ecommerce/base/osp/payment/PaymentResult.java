package com.ss.android.ugc.aweme.ecommerce.base.osp.payment;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class PaymentResult {

    @InterfaceC65349Pkn("error_code")
    public final String errorCode;

    @InterfaceC65349Pkn("payment_status")
    public final String paymentStatus;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentResult)) {
            return false;
        }
        PaymentResult paymentResult = (PaymentResult) obj;
        return o.LJ(this.paymentStatus, paymentResult.paymentStatus) && o.LJ(this.errorCode, paymentResult.errorCode);
    }

    public final int hashCode() {
        String str = this.paymentStatus;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentResult(paymentStatus=");
        LIZ.append(this.paymentStatus);
        LIZ.append(", errorCode=");
        return q.LIZIZ(LIZ, this.errorCode, ')', LIZ);
    }

    public PaymentResult(String str, String str2) {
        this.paymentStatus = str;
        this.errorCode = str2;
    }
}
