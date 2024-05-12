package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("match_quality_optimize_switch")
/* loaded from: classes14.dex */
public final class LiveMatchQualityOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMatchQualityOptimizeSetting INSTANCE = new LiveMatchQualityOptimizeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMatchQualityOptimizeSetting.class);
    }

    public final boolean enableOptimize() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
