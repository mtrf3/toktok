package com.bytedance.android.livesdk.model.message;

import X.InterfaceC65349Pkn;
import java.util.List;

/* loaded from: classes14.dex */
public final class FanTicketRoomNoticeContent {

    @InterfaceC65349Pkn("event_time")
    public long eventTime;

    @InterfaceC65349Pkn("fan_ticket_icon_url")
    public String fanTicketIconUrl = "";

    @InterfaceC65349Pkn("match_id")
    public long matchId;

    @InterfaceC65349Pkn("total_linkmic_fan_ticket")
    public long totalLinkmicFanTicket;

    @InterfaceC65349Pkn("user_fan_ticket")
    public List<UserFanTicket> userFanTicket;
}
