package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cover_camera_compliance")
/* loaded from: classes6.dex */
public final class LiveCoverCameraSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCoverCameraSetting INSTANCE = new LiveCoverCameraSetting();

    @Group("Enable New Camera")
    public static final int SETTING1 = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoverCameraSetting.class);
    }

    public final boolean enable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
