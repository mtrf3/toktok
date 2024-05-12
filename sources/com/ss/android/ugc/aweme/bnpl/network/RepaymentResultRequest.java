package com.ss.android.ugc.aweme.bnpl.network;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class RepaymentResultRequest extends F9E {

    @InterfaceC65349Pkn("repayment_id")
    public final String repaymentId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.repaymentId};
    }

    public RepaymentResultRequest(String repaymentId) {
        o.LJIIIZ(repaymentId, "repaymentId");
        this.repaymentId = repaymentId;
    }
}
