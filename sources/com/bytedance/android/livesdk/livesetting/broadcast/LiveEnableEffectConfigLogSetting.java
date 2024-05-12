package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_effect_config_log")
/* loaded from: classes6.dex */
public final class LiveEnableEffectConfigLogSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableEffectConfigLogSetting INSTANCE = new LiveEnableEffectConfigLogSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableEffectConfigLogSetting.class);
    }
}
