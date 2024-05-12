package com.bytedance.bdlocation.network.model;

import X.InterfaceC65349Pkn;
import X.Q89;
import X.X1D;
import defpackage.b0;

/* loaded from: classes2.dex */
public class BaseResp {

    @InterfaceC65349Pkn("StatusCode")
    public int statusCode;

    @InterfaceC65349Pkn("StatusMessage")
    public String statusMessage;

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BaseResp{statusMessage='");
        Q89.LIZIZ(LIZ, this.statusMessage, '\'', ", statusCode=");
        return b0.LIZJ(LIZ, this.statusCode, '}', LIZ);
    }
}
