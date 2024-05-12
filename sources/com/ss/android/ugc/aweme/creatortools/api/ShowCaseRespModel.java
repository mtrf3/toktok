package com.ss.android.ugc.aweme.creatortools.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShowCaseRespModel extends F9E {

    @InterfaceC65349Pkn("code")
    public final int code;

    @InterfaceC65349Pkn("data")
    public final ShowCaseModel data;

    @InterfaceC65349Pkn("message")
    public final String message;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.code), this.message, this.data};
    }

    public ShowCaseRespModel(int i, String message, ShowCaseModel data) {
        o.LJIIIZ(message, "message");
        o.LJIIIZ(data, "data");
        this.code = i;
        this.message = message;
        this.data = data;
    }
}
