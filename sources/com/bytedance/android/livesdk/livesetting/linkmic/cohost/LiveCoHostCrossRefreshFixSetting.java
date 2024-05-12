package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_cross_loop_refresh_fix")
/* loaded from: classes6.dex */
public final class LiveCoHostCrossRefreshFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveCoHostCrossRefreshFixSetting INSTANCE = new LiveCoHostCrossRefreshFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHostCrossRefreshFixSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
