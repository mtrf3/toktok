package com.bytedance.android.livesdk.livesetting.rank;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_hourly_rank_query_entrance_delay")
/* loaded from: classes6.dex */
public final class LiveHourlyRankQueryEntranceDelaySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3000;
    public static final LiveHourlyRankQueryEntranceDelaySetting INSTANCE = new LiveHourlyRankQueryEntranceDelaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveHourlyRankQueryEntranceDelaySetting.class);
    }
}
