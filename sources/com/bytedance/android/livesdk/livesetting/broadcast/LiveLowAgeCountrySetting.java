package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_low_age_country")
/* loaded from: classes6.dex */
public final class LiveLowAgeCountrySetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveLowAgeCountrySetting INSTANCE = new LiveLowAgeCountrySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveLowAgeCountrySetting.class);
    }
}
