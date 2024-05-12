package com.ss.android.ugc.aweme.bnpl.network.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StatusReason extends F9E {

    @InterfaceC65349Pkn("reason_code")
    public final int reasonCode;

    @InterfaceC65349Pkn("reason_msg")
    public final String reasonMsg;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.reasonCode), this.reasonMsg};
    }

    public StatusReason(int i, String reasonMsg) {
        o.LJIIIZ(reasonMsg, "reasonMsg");
        this.reasonCode = i;
        this.reasonMsg = reasonMsg;
    }
}
