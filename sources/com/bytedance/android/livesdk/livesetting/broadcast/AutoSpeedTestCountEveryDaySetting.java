package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "auto_speed_test_count_every_day")
/* loaded from: classes6.dex */
public final class AutoSpeedTestCountEveryDaySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final AutoSpeedTestCountEveryDaySetting INSTANCE = new AutoSpeedTestCountEveryDaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(AutoSpeedTestCountEveryDaySetting.class);
    }
}
