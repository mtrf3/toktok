package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("profit_low_age_restricted")
/* loaded from: classes6.dex */
public final class AgeRestrictedConfig {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final AgeRestrictedConfig INSTANCE = new AgeRestrictedConfig();

    public final boolean isLimit() {
        return SettingsManager.INSTANCE.getBooleanValue(AgeRestrictedConfig.class);
    }
}
