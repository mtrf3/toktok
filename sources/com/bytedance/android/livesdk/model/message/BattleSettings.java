package com.bytedance.android.livesdk.model.message;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes14.dex */
public final class BattleSettings extends F9E {

    @InterfaceC65349Pkn("banner_url")
    public String bannerUrl;

    @InterfaceC65349Pkn("battle_id")
    public Long battleId;

    @InterfaceC65349Pkn("channel_id")
    public Long channelId;

    @InterfaceC65349Pkn("config")
    public String config;

    @InterfaceC65349Pkn("duration")
    public Long duration;

    @InterfaceC65349Pkn("match_type")
    public Long matchType;

    @InterfaceC65349Pkn("mode")
    public int mode;

    @InterfaceC65349Pkn("start_time_ms")
    public Long startTimeMs;

    @InterfaceC65349Pkn("sub_type")
    public Long subType;

    @InterfaceC65349Pkn("theme")
    public String theme;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.battleId;
        Long l2 = this.startTimeMs;
        Long l3 = this.duration;
        String str = this.theme;
        Long l4 = this.channelId;
        Long l5 = this.matchType;
        String str2 = this.bannerUrl;
        Long l6 = this.subType;
        String str3 = this.config;
        return new Object[]{l, l, l2, l2, l3, l3, str, str, l4, l4, l5, l5, str2, str2, l6, l6, Integer.valueOf(this.mode), str3, str3};
    }
}
