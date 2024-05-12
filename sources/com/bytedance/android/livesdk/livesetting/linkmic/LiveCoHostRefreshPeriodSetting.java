package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_refresh_period")
/* loaded from: classes6.dex */
public final class LiveCoHostRefreshPeriodSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 30;
    public static final LiveCoHostRefreshPeriodSetting INSTANCE = new LiveCoHostRefreshPeriodSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHostRefreshPeriodSetting.class);
    }
}
