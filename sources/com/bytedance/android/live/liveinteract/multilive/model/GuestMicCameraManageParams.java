package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class GuestMicCameraManageParams extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public Long anchorId;

    @InterfaceC65349Pkn("change_scene")
    public int changeScene;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("guest_user_id")
    public Long guestUserId;

    @InterfaceC65349Pkn("op")
    public int op;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        Long l2 = this.guestUserId;
        Long l3 = this.anchorId;
        Long l4 = this.channelId;
        return new Object[]{l, l, l2, l2, l3, l3, Integer.valueOf(this.op), l4, l4};
    }
}
