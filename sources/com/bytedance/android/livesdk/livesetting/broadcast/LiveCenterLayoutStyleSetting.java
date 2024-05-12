package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_center_layout_style")
/* loaded from: classes6.dex */
public final class LiveCenterLayoutStyleSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCenterLayoutStyleSetting INSTANCE = new LiveCenterLayoutStyleSetting();

    public final boolean enableNewStyle() {
        if (SettingsManager.INSTANCE.getIntValue(LiveCenterLayoutStyleSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
