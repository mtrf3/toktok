package com.bytedance.android.livesdk.chatroom.model;

import X.F9E;
import X.InterfaceC65349Pkn;

/* loaded from: classes6.dex */
public class LatestBanRecordInfo extends F9E {

    @InterfaceC65349Pkn("ban_count")
    public int banCount;

    @InterfaceC65349Pkn("ban_duration")
    public long banDuration;

    @InterfaceC65349Pkn("ban_reason")
    public String banReason;

    @InterfaceC65349Pkn("ban_source")
    public int banSource = 1;

    @InterfaceC65349Pkn("ban_time")
    public long banTime;

    @InterfaceC65349Pkn("ban_time_left")
    public long banTimeLeft;

    @InterfaceC65349Pkn("detail_url")
    public String detailUrl;

    @InterfaceC65349Pkn("is_banned_forever")
    public boolean isBannedForever;

    @InterfaceC65349Pkn("log_id")
    public long logId;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.isBannedForever), Long.valueOf(this.banTimeLeft), Long.valueOf(this.banTime), Long.valueOf(this.banDuration), Integer.valueOf(this.banSource), this.detailUrl};
    }
}
