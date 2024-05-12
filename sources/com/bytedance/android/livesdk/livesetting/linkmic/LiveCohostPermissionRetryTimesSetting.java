package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_permission_retry_times")
/* loaded from: classes11.dex */
public final class LiveCohostPermissionRetryTimesSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final LiveCohostPermissionRetryTimesSetting INSTANCE = new LiveCohostPermissionRetryTimesSetting();

    public final int getValue() {
        if (LiveCohostPermissionOptSetting.INSTANCE.isOpenCohostPermissionRetry()) {
            return SettingsManager.INSTANCE.getIntValue(LiveCohostPermissionRetryTimesSetting.class);
        }
        return 3;
    }
}
