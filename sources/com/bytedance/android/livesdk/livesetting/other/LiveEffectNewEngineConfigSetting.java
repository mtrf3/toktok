package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_effect_new_engine_config")
/* loaded from: classes6.dex */
public final class LiveEffectNewEngineConfigSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveEffectNewEngineConfigSetting INSTANCE = new LiveEffectNewEngineConfigSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveEffectNewEngineConfigSetting.class);
    }
}
