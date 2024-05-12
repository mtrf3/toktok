package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkInitResult;

/* loaded from: classes14.dex */
public final class InitResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public LinkInitResult data;

    @Override // X.F9E
    public final Object[] getObjects() {
        LinkInitResult linkInitResult = this.data;
        return new Object[]{linkInitResult, linkInitResult};
    }
}
