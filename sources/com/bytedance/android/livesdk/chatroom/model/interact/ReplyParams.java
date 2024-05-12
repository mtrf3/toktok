package com.bytedance.android.livesdk.chatroom.model.interact;

import X.F9E;
import X.InterfaceC65349Pkn;
import X.WM7;

/* loaded from: classes17.dex */
public final class ReplyParams extends F9E {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("invite_user_id")
    public Long inviteUserId;

    @InterfaceC65349Pkn("reply_status")
    public Long replyStatus;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn(WM7.SCENE_SERVICE)
    public Long scene;

    @InterfaceC65349Pkn("sec_invite_user_id")
    public String secInviteUserId;

    @InterfaceC65349Pkn("transparent_extra")
    public String transparentExtra;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.channelId;
        Long l2 = this.replyStatus;
        Long l3 = this.roomId;
        Long l4 = this.inviteUserId;
        String str = this.secInviteUserId;
        Long l5 = this.scene;
        String str2 = this.transparentExtra;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4, str, str, l5, l5, str2, str2};
    }
}
