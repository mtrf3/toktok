package com.bytedance.android.live.liveinteract.match.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class BattleInviteRequestParams extends F9E {

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("gift_id")
    public long giftId;

    @InterfaceC65349Pkn("invite_type")
    public int inviteType;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("target_user_id")
    public Long targetUserId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.channelId;
        Long l2 = this.roomId;
        Long l3 = this.targetUserId;
        return new Object[]{l, l, l2, l2, Integer.valueOf(this.inviteType), l3, l3};
    }
}
