package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("web_offline_enabled")
/* loaded from: classes6.dex */
public final class WebOfflineEnabledSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final WebOfflineEnabledSetting INSTANCE = new WebOfflineEnabledSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(WebOfflineEnabledSetting.class);
    }
}
