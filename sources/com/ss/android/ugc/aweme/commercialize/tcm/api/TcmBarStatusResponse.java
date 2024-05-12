package com.ss.android.ugc.aweme.commercialize.tcm.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class TcmBarStatusResponse {

    @InterfaceC65349Pkn("status_code")
    public final int code;

    @InterfaceC65349Pkn("data")
    public final String data;

    @InterfaceC65349Pkn("status_msg")
    public final String msg;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TcmBarStatusResponse)) {
            return false;
        }
        TcmBarStatusResponse tcmBarStatusResponse = (TcmBarStatusResponse) obj;
        return this.code == tcmBarStatusResponse.code && o.LJ(this.msg, tcmBarStatusResponse.msg) && o.LJ(this.data, tcmBarStatusResponse.data);
    }

    public final int hashCode() {
        int i = this.code * 31;
        String str = this.msg;
        return this.data.hashCode() + ((i + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TcmBarStatusResponse(code=");
        LIZ.append(this.code);
        LIZ.append(", msg=");
        LIZ.append(this.msg);
        LIZ.append(", data=");
        return q.LIZIZ(LIZ, this.data, ')', LIZ);
    }

    public TcmBarStatusResponse(int i, String str, String data) {
        o.LJIIIZ(data, "data");
        this.code = i;
        this.msg = str;
        this.data = data;
    }

    public /* synthetic */ TcmBarStatusResponse(int i, String str, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? "" : str2);
    }
}
