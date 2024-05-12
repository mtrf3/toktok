package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.PerformanceSetting;

@SettingsKey("live_performance_setting")
/* loaded from: classes6.dex */
public final class LivePerformanceSettingSetting {

    @Group(isDefault = true, value = "default group")
    public static final PerformanceSetting DEFAULT;
    public static final LivePerformanceSettingSetting INSTANCE = new LivePerformanceSettingSetting();

    static {
        PerformanceSetting performanceSetting = new PerformanceSetting();
        performanceSetting.enable = true;
        DEFAULT = performanceSetting;
    }

    public final PerformanceSetting getValue() {
        PerformanceSetting performanceSetting = (PerformanceSetting) SettingsManager.INSTANCE.getValueSafely(LivePerformanceSettingSetting.class);
        if (performanceSetting == null) {
            return DEFAULT;
        }
        return performanceSetting;
    }

    public final PerformanceSetting getDEFAULT() {
        return DEFAULT;
    }
}
