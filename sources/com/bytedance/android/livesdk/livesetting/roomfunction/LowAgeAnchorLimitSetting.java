package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("low_age_anchor_limit")
/* loaded from: classes6.dex */
public final class LowAgeAnchorLimitSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "18";
    public static final LowAgeAnchorLimitSetting INSTANCE = new LowAgeAnchorLimitSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LowAgeAnchorLimitSetting.class);
    }
}
