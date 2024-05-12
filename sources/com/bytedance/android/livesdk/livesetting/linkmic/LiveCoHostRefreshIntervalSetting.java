package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_refresh_interval")
/* loaded from: classes6.dex */
public final class LiveCoHostRefreshIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 2;
    public static final LiveCoHostRefreshIntervalSetting INSTANCE = new LiveCoHostRefreshIntervalSetting();

    public final int getValue() {
        int intValue = SettingsManager.INSTANCE.getIntValue(LiveCoHostRefreshIntervalSetting.class);
        if (intValue < 2) {
            return 2;
        }
        return intValue;
    }
}
