package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PayErrorToast {

    @InterfaceC65349Pkn("error_code")
    public final String errorCode;

    @InterfaceC65349Pkn("error_msg")
    public final String errorMsg;

    @InterfaceC65349Pkn("error_text")
    public final String errorText;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayErrorToast)) {
            return false;
        }
        PayErrorToast payErrorToast = (PayErrorToast) obj;
        return o.LJ(this.errorCode, payErrorToast.errorCode) && o.LJ(this.errorMsg, payErrorToast.errorMsg) && o.LJ(this.errorText, payErrorToast.errorText);
    }

    public final int hashCode() {
        String str = this.errorCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorMsg;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PayErrorToast(errorCode=");
        LIZ.append(this.errorCode);
        LIZ.append(", errorMsg=");
        LIZ.append(this.errorMsg);
        LIZ.append(", errorText=");
        return q.LIZIZ(LIZ, this.errorText, ')', LIZ);
    }

    public PayErrorToast(String str, String str2, String str3) {
        this.errorCode = str;
        this.errorMsg = str2;
        this.errorText = str3;
    }
}
