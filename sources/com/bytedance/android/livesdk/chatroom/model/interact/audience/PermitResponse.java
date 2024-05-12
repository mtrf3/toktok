package com.bytedance.android.livesdk.chatroom.model.interact.audience;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class PermitResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public PermitResult data;

    @Override // X.F9E
    public final Object[] getObjects() {
        PermitResult permitResult = this.data;
        return new Object[]{permitResult, permitResult};
    }
}
