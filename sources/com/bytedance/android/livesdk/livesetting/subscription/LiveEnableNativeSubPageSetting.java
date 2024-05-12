package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_native_sub_page")
/* loaded from: classes6.dex */
public final class LiveEnableNativeSubPageSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableNativeSubPageSetting INSTANCE = new LiveEnableNativeSubPageSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableNativeSubPageSetting.class);
    }
}
