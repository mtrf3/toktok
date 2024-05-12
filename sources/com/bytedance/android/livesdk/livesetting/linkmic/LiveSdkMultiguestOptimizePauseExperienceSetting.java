package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_optimize_pause_experience")
/* loaded from: classes6.dex */
public final class LiveSdkMultiguestOptimizePauseExperienceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSdkMultiguestOptimizePauseExperienceSetting INSTANCE = new LiveSdkMultiguestOptimizePauseExperienceSetting();

    @Group("opt pause ui")
    public static final int OPT_PAUSE = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkMultiguestOptimizePauseExperienceSetting.class);
    }

    public final boolean isOptPauseExperience() {
        if (1 == getValue()) {
            return true;
        }
        return false;
    }
}
