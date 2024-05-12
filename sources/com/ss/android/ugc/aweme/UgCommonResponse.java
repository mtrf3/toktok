package com.ss.android.ugc.aweme;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UgCommonResponse {

    @InterfaceC65349Pkn("extra")
    public final UgCommonResponseExtra extra;

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UgCommonResponse)) {
            return false;
        }
        UgCommonResponse ugCommonResponse = (UgCommonResponse) obj;
        return this.statusCode == ugCommonResponse.statusCode && o.LJ(this.extra, ugCommonResponse.extra);
    }

    public final int hashCode() {
        int i = this.statusCode * 31;
        UgCommonResponseExtra ugCommonResponseExtra = this.extra;
        return i + (ugCommonResponseExtra == null ? 0 : ugCommonResponseExtra.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UgCommonResponse(statusCode=");
        LIZ.append(this.statusCode);
        LIZ.append(", extra=");
        LIZ.append(this.extra);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public UgCommonResponse(int i, UgCommonResponseExtra ugCommonResponseExtra) {
        this.statusCode = i;
        this.extra = ugCommonResponseExtra;
    }
}
