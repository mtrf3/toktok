package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes13.dex */
public final class MgetPullStreamInfosParams extends F9E {

    @InterfaceC65349Pkn("room_ids")
    public String roomIds;

    @Override // X.F9E
    public final Object[] getObjects() {
        String str = this.roomIds;
        return new Object[]{str, str};
    }
}
