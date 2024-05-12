package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes13.dex */
public final class GetSettingsParams extends F9E {

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("sec_user_id")
    public String secUserId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        String str = this.secUserId;
        return new Object[]{l, l, str, str};
    }
}
