package com.bytedance.android.livesdk.model.message.linkcore;

import X.C113554cx;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class LinkMicCommonResp extends F9E {

    @InterfaceC65349Pkn("err_code")
    public long errorCode;

    @InterfaceC65349Pkn("err_msg")
    public String errorMsg;

    @InterfaceC65349Pkn("extra")
    public Map<String, byte[]> extra;

    /* JADX WARN: Multi-variable type inference failed */
    public LinkMicCommonResp() {
        this(0L, null, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.errorCode), this.errorMsg, this.extra};
    }

    public LinkMicCommonResp(long j, String errorMsg, Map<String, byte[]> extra) {
        o.LJIIIZ(errorMsg, "errorMsg");
        o.LJIIIZ(extra, "extra");
        this.errorCode = j;
        this.errorMsg = errorMsg;
        this.extra = extra;
    }

    public /* synthetic */ LinkMicCommonResp(long j, String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? C113554cx.LJJJLIIL() : map);
    }
}
