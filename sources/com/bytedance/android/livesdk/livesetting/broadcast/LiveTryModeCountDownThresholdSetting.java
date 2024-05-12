package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_try_mode_count_down_threshold")
/* loaded from: classes6.dex */
public final class LiveTryModeCountDownThresholdSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 120;
    public static final LiveTryModeCountDownThresholdSetting INSTANCE = new LiveTryModeCountDownThresholdSetting();
    public static final int value = SettingsManager.INSTANCE.getIntValue(LiveTryModeCountDownThresholdSetting.class);

    public final int threshold() {
        return value;
    }
}
