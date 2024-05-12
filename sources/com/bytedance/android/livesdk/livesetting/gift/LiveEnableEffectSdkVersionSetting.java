package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_effect_sdk_version_setting")
/* loaded from: classes6.dex */
public final class LiveEnableEffectSdkVersionSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableEffectSdkVersionSetting INSTANCE = new LiveEnableEffectSdkVersionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableEffectSdkVersionSetting.class);
    }
}
