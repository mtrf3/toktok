package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_layout_tracker_enable")
/* loaded from: classes14.dex */
public final class LinkmicLayoutTrackerEnableSetting {

    @Group("close")
    public static final int CLOSE = 0;

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LinkmicLayoutTrackerEnableSetting INSTANCE = new LinkmicLayoutTrackerEnableSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkmicLayoutTrackerEnableSetting.class);
    }

    public final boolean enable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
