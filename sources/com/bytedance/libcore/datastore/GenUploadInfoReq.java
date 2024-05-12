package com.bytedance.libcore.datastore;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class GenUploadInfoReq {

    @InterfaceC65349Pkn("extra")
    public String extra = "";

    @InterfaceC65349Pkn("request_type")
    public int type;

    public final String getExtra() {
        return this.extra;
    }

    public final int getType() {
        return this.type;
    }

    public final void setExtra(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.extra = str;
    }

    public final void setType(int i) {
        this.type = i;
    }
}
