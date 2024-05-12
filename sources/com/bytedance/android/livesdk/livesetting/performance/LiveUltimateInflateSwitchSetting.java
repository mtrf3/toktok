package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_ultimateinflate_switch")
/* loaded from: classes6.dex */
public final class LiveUltimateInflateSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveUltimateInflateSwitchSetting INSTANCE = new LiveUltimateInflateSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveUltimateInflateSwitchSetting.class);
    }
}
