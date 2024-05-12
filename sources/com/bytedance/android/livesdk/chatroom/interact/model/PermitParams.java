package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;

/* loaded from: classes14.dex */
public final class PermitParams extends F9E {

    @InterfaceC65349Pkn("action_id")
    public Long actionId;

    @InterfaceC65349Pkn("apply_room_id")
    public Long applyRoomId;

    @InterfaceC65349Pkn("apply_user_id")
    public Long applyUserId;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("effective_seconds")
    public Long effectiveSeconds;

    @InterfaceC65349Pkn("permit_status")
    public Long permitStatus;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public Long scene;

    @InterfaceC65349Pkn("sec_apply_user_id")
    public String secApplyUserId;

    @InterfaceC65349Pkn("transparent_extra")
    public String transparentExtra;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.channelId;
        Long l2 = this.permitStatus;
        Long l3 = this.roomId;
        Long l4 = this.applyUserId;
        String str = this.secApplyUserId;
        Long l5 = this.scene;
        Long l6 = this.effectiveSeconds;
        String str2 = this.transparentExtra;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4, str, str, l5, l5, l6, l6, str2, str2};
    }
}
