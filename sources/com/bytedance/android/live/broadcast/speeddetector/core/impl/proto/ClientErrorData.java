package com.bytedance.android.live.broadcast.speeddetector.core.impl.proto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;

/* loaded from: classes.dex */
public final class ClientErrorData {

    @InterfaceC65349Pkn("code")
    public int code;

    @InterfaceC65349Pkn("msg")
    public String msg = "";

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ClientErrorData(code=");
        LIZ.append(this.code);
        LIZ.append(", msg=");
        return q.LIZIZ(LIZ, this.msg, ')', LIZ);
    }
}
