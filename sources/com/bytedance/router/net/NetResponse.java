package com.bytedance.router.net;

import X.JBR;
import X.X1D;

/* loaded from: classes2.dex */
public class NetResponse {
    public int errorCode = -1;
    public String content = "";

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("[errorCode: ");
        LIZ.append(this.errorCode);
        LIZ.append(", content:");
        return JBR.LJFF(LIZ, this.content, "]", LIZ);
    }
}
