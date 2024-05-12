package com.bytedance.android.livesdk.chatroom.model.multilive;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes16.dex */
public final class JoinChannelParams extends F9E {

    @InterfaceC65349Pkn("access_key")
    public String accessKey;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("transparent_extra")
    public String transparentExtra;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        String str = this.accessKey;
        String str2 = this.transparentExtra;
        return new Object[]{l, l, str, str, str2, str2};
    }
}
