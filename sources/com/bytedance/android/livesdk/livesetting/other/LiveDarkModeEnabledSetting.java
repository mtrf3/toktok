package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_dark_mode_enabled")
/* loaded from: classes6.dex */
public final class LiveDarkModeEnabledSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveDarkModeEnabledSetting INSTANCE = new LiveDarkModeEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveDarkModeEnabledSetting.class);
    }
}
