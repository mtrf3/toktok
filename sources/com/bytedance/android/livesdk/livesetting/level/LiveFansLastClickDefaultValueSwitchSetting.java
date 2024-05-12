package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_fans_last_click_default_value_switch")
/* loaded from: classes6.dex */
public final class LiveFansLastClickDefaultValueSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveFansLastClickDefaultValueSwitchSetting INSTANCE = new LiveFansLastClickDefaultValueSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFansLastClickDefaultValueSwitchSetting.class);
    }
}
