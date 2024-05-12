package com.ss.android.ugc.aweme.account.loginsetting;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class BoolData extends F9E {

    @InterfaceC65349Pkn("data")
    public final BoolResult data;

    @InterfaceC65349Pkn("message")
    public final String message;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.data, this.message};
    }

    public BoolData(BoolResult data, String message) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(message, "message");
        this.data = data;
        this.message = message;
    }
}
