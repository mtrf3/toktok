package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class JoinChannelResponse extends F9E {

    @InterfaceC65349Pkn("data")
    public MultiLiveLayoutInfo data;

    @Override // X.F9E
    public final Object[] getObjects() {
        MultiLiveLayoutInfo multiLiveLayoutInfo = this.data;
        return new Object[]{multiLiveLayoutInfo, multiLiveLayoutInfo};
    }
}
