package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_max_enter_background_time")
/* loaded from: classes6.dex */
public final class LiveMaxEnterBackgroundTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 60000;
    public static final LiveMaxEnterBackgroundTimeSetting INSTANCE = new LiveMaxEnterBackgroundTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMaxEnterBackgroundTimeSetting.class);
    }
}
