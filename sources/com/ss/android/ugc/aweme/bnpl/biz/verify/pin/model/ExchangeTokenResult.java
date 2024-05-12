package com.ss.android.ugc.aweme.bnpl.biz.verify.pin.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class ExchangeTokenResult extends F9E {

    @InterfaceC65349Pkn("fp_session_id")
    public final String session;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.session};
    }

    public ExchangeTokenResult(String session) {
        o.LJIIIZ(session, "session");
        this.session = session;
    }
}
