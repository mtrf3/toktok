package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_permission_fallback_enable")
/* loaded from: classes6.dex */
public final class LiveCohostPermissionFallbackSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCohostPermissionFallbackSetting INSTANCE = new LiveCohostPermissionFallbackSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostPermissionFallbackSetting.class);
    }

    public static final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
