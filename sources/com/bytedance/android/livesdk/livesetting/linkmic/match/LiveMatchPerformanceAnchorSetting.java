package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("tt_live_match_performance_monitor_anchor_rate")
/* loaded from: classes6.dex */
public final class LiveMatchPerformanceAnchorSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveMatchPerformanceAnchorSetting INSTANCE = new LiveMatchPerformanceAnchorSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMatchPerformanceAnchorSetting.class);
    }
}
