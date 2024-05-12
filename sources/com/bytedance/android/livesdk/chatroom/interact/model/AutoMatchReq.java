package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class AutoMatchReq extends F9E {

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("user_id")
    public Long userId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        Long l2 = this.userId;
        return new Object[]{l, l, l2, l2};
    }
}
