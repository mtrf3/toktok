package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_bitrate_monitor")
/* loaded from: classes6.dex */
public final class LiveEnableBitrateMonitorSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEnableBitrateMonitorSetting INSTANCE = new LiveEnableBitrateMonitorSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveEnableBitrateMonitorSetting.class);
    }
}
