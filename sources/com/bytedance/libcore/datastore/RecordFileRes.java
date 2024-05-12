package com.bytedance.libcore.datastore;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class RecordFileRes {

    @InterfaceC65349Pkn("status_code")
    public int code;

    @InterfaceC65349Pkn("message")
    public String message = "";

    public final int getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.message = str;
    }
}
