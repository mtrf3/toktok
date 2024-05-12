package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_effect_log")
/* loaded from: classes6.dex */
public final class LiveEnableEffectLogSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableEffectLogSetting INSTANCE = new LiveEnableEffectLogSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableEffectLogSetting.class);
    }
}
