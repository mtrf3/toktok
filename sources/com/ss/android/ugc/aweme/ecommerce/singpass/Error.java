package com.ss.android.ugc.aweme.ecommerce.singpass;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Error {

    @InterfaceC65349Pkn("code")
    public final Integer code;

    @InterfaceC65349Pkn("error_msg")
    public final String errorMsg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Error)) {
            return false;
        }
        Error error = (Error) obj;
        return o.LJ(this.code, error.code) && o.LJ(this.errorMsg, error.errorMsg);
    }

    public final int hashCode() {
        Integer num = this.code;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.errorMsg;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Error(code=");
        LIZ.append(this.code);
        LIZ.append(", errorMsg=");
        return q.LIZIZ(LIZ, this.errorMsg, ')', LIZ);
    }

    public Error(Integer num, String str) {
        this.code = num;
        this.errorMsg = str;
    }
}
