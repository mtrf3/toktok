package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_alog")
/* loaded from: classes6.dex */
public final class LiveEnableALogSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveEnableALogSetting INSTANCE = new LiveEnableALogSetting();
    public static boolean value = SettingsManager.INSTANCE.getBooleanValue(LiveEnableALogSetting.class);

    public final void update() {
        value = SettingsManager.INSTANCE.getBooleanValue(LiveEnableALogSetting.class);
    }

    public final boolean isDisable() {
        return !isEnable();
    }

    public final boolean isEnable() {
        return value;
    }
}
