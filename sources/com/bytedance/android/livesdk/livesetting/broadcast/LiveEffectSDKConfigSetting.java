package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_effect_sdk_config")
/* loaded from: classes6.dex */
public final class LiveEffectSDKConfigSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveEffectSDKConfigSetting INSTANCE = new LiveEffectSDKConfigSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveEffectSDKConfigSetting.class);
    }
}
