package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BizPermitParams extends F9E {

    @InterfaceC65349Pkn("effective_seconds")
    public long effectiveSeconds;

    public BizPermitParams() {
        this(0L, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.effectiveSeconds)};
    }

    public BizPermitParams(long j) {
        this.effectiveSeconds = j;
    }

    public /* synthetic */ BizPermitParams(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
