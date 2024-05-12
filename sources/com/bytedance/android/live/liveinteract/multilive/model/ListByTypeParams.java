package com.bytedance.android.live.liveinteract.multilive.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class ListByTypeParams extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public Long anchorId;

    @InterfaceC65349Pkn("applier_list_pin_gift_score_threshold")
    public long applierListPinGiftScoreThreshold;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("list_type")
    public int listType;

    @InterfaceC65349Pkn("live_room_mode")
    public long liveRoomMode;

    @InterfaceC65349Pkn("reason")
    public int reason;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("source")
    public int source;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.roomId;
        Long l2 = this.channelId;
        Long l3 = this.anchorId;
        return new Object[]{l, l, l2, l2, l3, l3, Integer.valueOf(this.listType)};
    }
}
