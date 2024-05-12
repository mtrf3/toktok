package com.ss.android.ugc.aweme.ttep.effectapply;

import X.F9E;
import X.HH1;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes7.dex */
public final class EffectFetchApiResBean extends F9E {

    @InterfaceC65349Pkn("data")
    public final String data;

    @InterfaceC65349Pkn("loki_busi_msg")
    public final String lokiBusiMsg;

    @InterfaceC65349Pkn("message")
    public final String message;

    @InterfaceC65349Pkn("status_code")
    public final int status;

    /* JADX WARN: Multi-variable type inference failed */
    public EffectFetchApiResBean() {
        this(null, 0 == true ? 1 : 0, 0, 0 == true ? 1 : 0, 15, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.data, this.message, Integer.valueOf(this.status), this.lokiBusiMsg};
    }

    public EffectFetchApiResBean(String str, String str2, int i, String str3) {
        HH1.LIZ(str, "data", str2, "message", str3, "lokiBusiMsg");
        this.data = str;
        this.message = str2;
        this.status = i;
        this.lokiBusiMsg = str3;
    }

    public /* synthetic */ EffectFetchApiResBean(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? "" : str3);
    }
}
