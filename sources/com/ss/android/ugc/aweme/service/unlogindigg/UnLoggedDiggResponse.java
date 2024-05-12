package com.ss.android.ugc.aweme.service.unlogindigg;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class UnLoggedDiggResponse extends F9E {

    @InterfaceC65349Pkn("status_code")
    public final int statusCode;

    @InterfaceC65349Pkn("status_msg")
    public final String statusMsg;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.statusCode), this.statusMsg};
    }

    public UnLoggedDiggResponse(int i, String statusMsg) {
        o.LJIIIZ(statusMsg, "statusMsg");
        this.statusCode = i;
        this.statusMsg = statusMsg;
    }
}
