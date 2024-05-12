package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sdk_multiguest_monitor_config")
/* loaded from: classes14.dex */
public final class LiveSdkMultiGuestMonitorConfigSetting {
    public static final LiveSdkMultiGuestMonitorConfigSetting INSTANCE = new LiveSdkMultiGuestMonitorConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveSdkMultiGuestMonitorConfig DEFAULT = new LiveSdkMultiGuestMonitorConfig(false, 0, 0, 0, 15, null);

    public final LiveSdkMultiGuestMonitorConfig getValue() {
        LiveSdkMultiGuestMonitorConfig liveSdkMultiGuestMonitorConfig = (LiveSdkMultiGuestMonitorConfig) SettingsManager.INSTANCE.getValueSafely(LiveSdkMultiGuestMonitorConfigSetting.class);
        if (liveSdkMultiGuestMonitorConfig == null) {
            return DEFAULT;
        }
        return liveSdkMultiGuestMonitorConfig;
    }
}
