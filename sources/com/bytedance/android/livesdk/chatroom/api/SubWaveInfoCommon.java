package com.bytedance.android.livesdk.chatroom.api;

import X.InterfaceC65349Pkn;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public final class SubWaveInfoCommon {

    @InterfaceC65349Pkn("end_time")
    public long endTime;

    @InterfaceC65349Pkn("start_time")
    public long startTime;

    @InterfaceC65349Pkn("sub_wave_settings")
    public AnchorSubWaveCurrentSettings subWaveSettings;

    @InterfaceC65349Pkn("thanks_list")
    public List<SubWaveSubscriberInfo> thanksList = new ArrayList();

    @InterfaceC65349Pkn("total_sub_count")
    public long totalSubCount;

    @InterfaceC65349Pkn("wave_open_record_id")
    public long waveOpenRecordId;

    @InterfaceC65349Pkn("wave_status")
    public int waveStatus;

    @InterfaceC65349Pkn("wave_sub_count")
    public long waveSubCount;

    @InterfaceC65349Pkn("wave_target_sub_count")
    public long waveTargetSubCount;
}
