package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_permission_period")
/* loaded from: classes11.dex */
public final class LiveCohostPermissionPeriodSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 600;
    public static final LiveCohostPermissionPeriodSetting INSTANCE = new LiveCohostPermissionPeriodSetting();

    public final int getValue() {
        if (LiveCohostPermissionOptSetting.INSTANCE.isOpenCohostPermissionRetry()) {
            return SettingsManager.INSTANCE.getIntValue(LiveCohostPermissionPeriodSetting.class);
        }
        return 600;
    }
}
