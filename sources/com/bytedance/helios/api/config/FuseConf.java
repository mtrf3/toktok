package com.bytedance.helios.api.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class FuseConf extends F9E {

    @InterfaceC65349Pkn("code")
    public final int code;

    @InterfaceC65349Pkn("message")
    public final String message;

    /* JADX WARN: Multi-variable type inference failed */
    public FuseConf() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.code), this.message};
    }

    public FuseConf(int i, String message) {
        o.LJIIIZ(message, "message");
        this.code = i;
        this.message = message;
    }

    public /* synthetic */ FuseConf(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 410 : i, (i2 & 2) != 0 ? "this api is not allow" : str);
    }
}
