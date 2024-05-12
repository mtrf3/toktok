package com.ss.android.ugc.aweme.account.login.v2.network;

import X.InterfaceC65349Pkn;
import X.X1D;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Check2SvPushClickResponseWrap {

    @InterfaceC65349Pkn("data")
    public final Check2SvPushClickResponse data;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public Check2SvPushClickResponseWrap() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Check2SvPushClickResponseWrap)) {
            return false;
        }
        Check2SvPushClickResponseWrap check2SvPushClickResponseWrap = (Check2SvPushClickResponseWrap) obj;
        return o.LJ(this.message, check2SvPushClickResponseWrap.message) && o.LJ(this.data, check2SvPushClickResponseWrap.data);
    }

    public final int hashCode() {
        String str = this.message;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Check2SvPushClickResponse check2SvPushClickResponse = this.data;
        return hashCode + (check2SvPushClickResponse != null ? check2SvPushClickResponse.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Check2SvPushClickResponseWrap(message=");
        LIZ.append(this.message);
        LIZ.append(", data=");
        LIZ.append(this.data);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public Check2SvPushClickResponseWrap(String str, Check2SvPushClickResponse check2SvPushClickResponse) {
        this.message = str;
        this.data = check2SvPushClickResponse;
    }

    public /* synthetic */ Check2SvPushClickResponseWrap(String str, Check2SvPushClickResponse check2SvPushClickResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : check2SvPushClickResponse);
    }
}
