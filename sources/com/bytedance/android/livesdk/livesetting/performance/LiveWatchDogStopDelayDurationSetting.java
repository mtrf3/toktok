package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_watchdog_stop_delay_duration")
/* loaded from: classes6.dex */
public final class LiveWatchDogStopDelayDurationSetting {
    public static final LiveWatchDogStopDelayDurationSetting INSTANCE = new LiveWatchDogStopDelayDurationSetting();

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 10000;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveWatchDogStopDelayDurationSetting.class);
    }
}
