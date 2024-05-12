package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.ApplyResult;

/* loaded from: classes14.dex */
public final class ApplyResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public ApplyResult data;

    @Override // X.F9E
    public final Object[] getObjects() {
        ApplyResult applyResult = this.data;
        return new Object[]{applyResult, applyResult};
    }
}
