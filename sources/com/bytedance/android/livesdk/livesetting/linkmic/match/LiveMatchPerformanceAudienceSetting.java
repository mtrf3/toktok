package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("tt_live_match_performance_monitor_audience_rate")
/* loaded from: classes6.dex */
public final class LiveMatchPerformanceAudienceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveMatchPerformanceAudienceSetting INSTANCE = new LiveMatchPerformanceAudienceSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMatchPerformanceAudienceSetting.class);
    }
}
