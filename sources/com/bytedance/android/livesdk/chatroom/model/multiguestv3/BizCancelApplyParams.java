package com.bytedance.android.livesdk.chatroom.model.multiguestv3;

import X.F9E;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes14.dex */
public final class BizCancelApplyParams extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public long anchorId;

    public BizCancelApplyParams() {
        this(0L, 1, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.anchorId)};
    }

    public BizCancelApplyParams(long j) {
        this.anchorId = j;
    }

    public /* synthetic */ BizCancelApplyParams(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j);
    }
}
