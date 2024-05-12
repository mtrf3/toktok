package com.bytedance.android.livesdk.model.message.battle;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;

/* loaded from: classes14.dex */
public class BattleSetting extends F9E {

    @InterfaceC65349Pkn("battle_id")
    public long battleId;

    @InterfaceC65349Pkn("battle_type")
    public int battleType;

    @InterfaceC65349Pkn("channel_id")
    public long channelId;

    @InterfaceC65349Pkn("duration")
    public int duration;

    @InterfaceC65349Pkn("gift_mode_meta")
    public GiftModeMeta giftModeMeta;

    @InterfaceC65349Pkn("invite_type")
    public int inviteType;

    @InterfaceC65349Pkn("start_time_ms")
    public long startTimeMs;

    @InterfaceC65349Pkn("status")
    public int status;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Long.valueOf(this.channelId), Long.valueOf(this.battleId), Long.valueOf(this.startTimeMs), Integer.valueOf(this.duration), Integer.valueOf(this.status), Integer.valueOf(this.inviteType)};
    }
}
