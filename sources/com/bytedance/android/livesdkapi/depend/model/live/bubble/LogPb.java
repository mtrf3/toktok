package com.bytedance.android.livesdkapi.depend.model.live.bubble;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LogPb extends F9E implements Serializable {

    @InterfaceC65349Pkn("impr_id")
    public String imprId;

    /* JADX WARN: Multi-variable type inference failed */
    public LogPb() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LogPb copy$default(LogPb logPb, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = logPb.imprId;
        }
        return logPb.copy(str);
    }

    public final LogPb copy(String imprId) {
        o.LJIIIZ(imprId, "imprId");
        return new LogPb(imprId);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.imprId};
    }

    public final String getImprId() {
        return this.imprId;
    }

    public LogPb(String imprId) {
        o.LJIIIZ(imprId, "imprId");
        this.imprId = imprId;
    }

    public final void setImprId(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.imprId = str;
    }

    public /* synthetic */ LogPb(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
