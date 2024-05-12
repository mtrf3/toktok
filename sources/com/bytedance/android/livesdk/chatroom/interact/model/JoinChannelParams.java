package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;

/* loaded from: classes16.dex */
public final class JoinChannelParams extends F9E {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public Long scene;

    @InterfaceC65349Pkn("transparent_extra")
    public String transparentExtra;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.channelId;
        Long l2 = this.scene;
        String str = this.transparentExtra;
        return new Object[]{l, l, l2, l2, str, str};
    }
}
