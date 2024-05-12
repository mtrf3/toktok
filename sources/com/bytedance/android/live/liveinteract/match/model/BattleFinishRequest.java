package com.bytedance.android.live.liveinteract.match.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class BattleFinishRequest extends F9E {

    @InterfaceC65349Pkn("battle_id")
    public Long battleId;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("cut_short")
    public Boolean cutShort;

    @InterfaceC65349Pkn("finish_cur_bitrate")
    public long finishCurBitrate;

    @InterfaceC65349Pkn("finish_is_background")
    public long finishIsBackground;

    @InterfaceC65349Pkn("finish_is_sdk")
    public long finishIsSdk;

    @InterfaceC65349Pkn("finish_network_quality")
    public long finishNetworkQuality;

    @InterfaceC65349Pkn("finish_source")
    public String finishSource = "";

    @InterfaceC65349Pkn("other_party_left")
    public Boolean otherPartyLeft;

    @InterfaceC65349Pkn("other_party_user_id")
    public Long otherPartyUserId;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.channelId;
        Boolean bool = this.cutShort;
        Long l2 = this.battleId;
        Boolean bool2 = this.otherPartyLeft;
        Long l3 = this.otherPartyUserId;
        return new Object[]{l, l, bool, bool, l2, l2, bool2, bool2, l3, l3};
    }
}
