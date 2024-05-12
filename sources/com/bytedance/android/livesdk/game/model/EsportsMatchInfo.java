package com.bytedance.android.livesdk.game.model;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class EsportsMatchInfo {

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("match_status")
    public int matchStatus;

    @InterfaceC65349Pkn("reserve_status")
    public int reserveStatus;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("total_participants")
    public long totalParticipants;

    @InterfaceC65349Pkn("match_id")
    public String matchId = "";

    @InterfaceC65349Pkn("match_name")
    public String matchName = "";

    @InterfaceC65349Pkn("participants")
    public List<EsportsParticipant> participants = new ArrayList();
}
