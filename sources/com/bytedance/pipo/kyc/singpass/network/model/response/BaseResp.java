package com.bytedance.pipo.kyc.singpass.network.model.response;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class BaseResp extends F9E {

    @InterfaceC65349Pkn("statusCode")
    public final int statusCode;

    @InterfaceC65349Pkn("statusMessage")
    public final String statusMessage;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.statusMessage};
    }

    public BaseResp(int i, String statusMessage) {
        o.LJIIIZ(statusMessage, "statusMessage");
        this.statusCode = i;
        this.statusMessage = statusMessage;
    }
}
