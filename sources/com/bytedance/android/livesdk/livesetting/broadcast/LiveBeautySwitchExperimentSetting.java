package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_beauty_switch_experiment")
/* loaded from: classes6.dex */
public final class LiveBeautySwitchExperimentSetting {
    public static final LiveBeautySwitchExperimentSetting INSTANCE = new LiveBeautySwitchExperimentSetting();

    @Group(isDefault = true, value = "default group")
    public static final BeautyConfig DEFAULT = new BeautyConfig(false, false, 3, null);

    private final BeautyConfig getValue() {
        return (BeautyConfig) SettingsManager.INSTANCE.getValueSafely(LiveBeautySwitchExperimentSetting.class);
    }

    public final boolean hasNone() {
        BeautyConfig value = getValue();
        if (value != null) {
            return value.hasNone;
        }
        return false;
    }

    public final boolean isUCAN() {
        BeautyConfig value = getValue();
        if (value != null) {
            return value.hasBubble;
        }
        return false;
    }
}
