package com.bytedance.android.livesdk.livesetting.security;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_support_power_permission")
/* loaded from: classes6.dex */
public final class LiveSupportPowerPermissionSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveSupportPowerPermissionSetting INSTANCE = new LiveSupportPowerPermissionSetting();

    public final boolean isEnabled() {
        if (SettingsManager.INSTANCE.getIntValue(LiveSupportPowerPermissionSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
