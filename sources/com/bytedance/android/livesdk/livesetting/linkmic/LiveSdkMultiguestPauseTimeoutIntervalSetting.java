package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_pause_timeout_interval")
/* loaded from: classes11.dex */
public final class LiveSdkMultiguestPauseTimeoutIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSdkMultiguestPauseTimeoutIntervalSetting INSTANCE = new LiveSdkMultiguestPauseTimeoutIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveSdkMultiguestPauseTimeoutIntervalSetting.class);
    }
}
