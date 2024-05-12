package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_core_camera_log_level")
/* loaded from: classes6.dex */
public final class LiveCoreCameraLogLevelSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCoreCameraLogLevelSetting INSTANCE = new LiveCoreCameraLogLevelSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoreCameraLogLevelSetting.class);
    }
}
