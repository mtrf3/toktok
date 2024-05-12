package com.bytedance.android.livesdk.chatroom.interact.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class ReplyParams extends F9E {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("invite_user_id")
    public Long inviteUserId;

    @InterfaceC65349Pkn("join_channel")
    public Boolean joinChannel;

    @InterfaceC65349Pkn("link_type")
    public Long linkType;

    @InterfaceC65349Pkn("reply_status")
    public Long replyStatus;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("transparent_extra")
    public String transparentExtra;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.channelId;
        Long l2 = this.replyStatus;
        Long l3 = this.roomId;
        Long l4 = this.inviteUserId;
        String str = this.transparentExtra;
        Long l5 = this.linkType;
        Boolean bool = this.joinChannel;
        return new Object[]{l, l, l2, l2, l3, l3, l4, l4, str, str, l5, l5, bool, bool};
    }
}
