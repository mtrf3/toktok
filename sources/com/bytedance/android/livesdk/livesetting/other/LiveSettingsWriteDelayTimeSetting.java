package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_settings_write_delay_time")
/* loaded from: classes6.dex */
public final class LiveSettingsWriteDelayTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 500;
    public static final LiveSettingsWriteDelayTimeSetting INSTANCE = new LiveSettingsWriteDelayTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveSettingsWriteDelayTimeSetting.class);
    }
}
