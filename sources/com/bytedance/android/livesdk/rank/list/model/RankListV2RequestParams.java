package com.bytedance.android.livesdk.rank.list.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes17.dex */
public final class RankListV2RequestParams extends F9E {

    @InterfaceC65349Pkn("anchor_id")
    public Long anchorId;

    @InterfaceC65349Pkn("gap_interval")
    public long gapInterval;

    @InterfaceC65349Pkn("league_phase")
    public int leaguePhase;

    @InterfaceC65349Pkn("rank_type")
    public int rankType;

    @InterfaceC65349Pkn("room_id")
    public Long roomId;

    @InterfaceC65349Pkn("use_simple_user")
    public boolean useSimpleUser;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.anchorId;
        Long l2 = this.roomId;
        return new Object[]{l, l, l2, l2, Integer.valueOf(this.rankType)};
    }
}
