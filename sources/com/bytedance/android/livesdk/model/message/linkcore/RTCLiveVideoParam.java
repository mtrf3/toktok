package com.bytedance.android.livesdk.model.message.linkcore;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes15.dex */
public final class RTCLiveVideoParam extends F9E {

    @InterfaceC65349Pkn("params")
    public RTCVideoParam serverDefineParam;

    @InterfaceC65349Pkn("strategy_id")
    public int strategyId;

    /* JADX WARN: Multi-variable type inference failed */
    public RTCLiveVideoParam() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.strategyId), this.serverDefineParam};
    }

    public RTCLiveVideoParam(int i, RTCVideoParam rTCVideoParam) {
        this.strategyId = i;
        this.serverDefineParam = rTCVideoParam;
    }

    public /* synthetic */ RTCLiveVideoParam(int i, RTCVideoParam rTCVideoParam, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? null : rTCVideoParam);
    }
}
