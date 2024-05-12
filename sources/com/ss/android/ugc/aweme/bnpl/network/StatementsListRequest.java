package com.ss.android.ugc.aweme.bnpl.network;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class StatementsListRequest extends F9E {

    @InterfaceC65349Pkn("paid_status")
    public final String paidStatus;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.paidStatus};
    }

    public StatementsListRequest(String paidStatus) {
        o.LJIIIZ(paidStatus, "paidStatus");
        this.paidStatus = paidStatus;
    }
}
