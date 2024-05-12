package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_permission_opt")
/* loaded from: classes11.dex */
public final class LiveCohostPermissionOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCohostPermissionOptSetting INSTANCE = new LiveCohostPermissionOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostPermissionOptSetting.class);
    }

    public final boolean isOpenCohostPermissionRetry() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
