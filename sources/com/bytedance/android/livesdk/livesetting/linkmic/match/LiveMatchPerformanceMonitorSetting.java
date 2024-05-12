package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("tt_live_match_performance_monitor_enable")
/* loaded from: classes6.dex */
public final class LiveMatchPerformanceMonitorSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMatchPerformanceMonitorSetting INSTANCE = new LiveMatchPerformanceMonitorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMatchPerformanceMonitorSetting.class);
    }
}
