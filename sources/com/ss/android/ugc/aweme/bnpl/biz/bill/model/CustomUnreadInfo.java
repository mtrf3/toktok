package com.ss.android.ugc.aweme.bnpl.biz.bill.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes20.dex */
public final class CustomUnreadInfo extends F9E {

    @InterfaceC65349Pkn("data")
    public final int data;

    @InterfaceC65349Pkn("code")
    public final String errorCode;

    @InterfaceC65349Pkn("message")
    public final String errorMsg;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.errorCode, this.errorMsg, Integer.valueOf(this.data)};
    }

    public CustomUnreadInfo(String errorCode, String errorMsg, int i) {
        o.LJIIIZ(errorCode, "errorCode");
        o.LJIIIZ(errorMsg, "errorMsg");
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
        this.data = i;
    }
}
