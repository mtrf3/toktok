package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_cross_active_fix")
/* loaded from: classes6.dex */
public final class LiveCoHostCrossActiveFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveCoHostCrossActiveFixSetting INSTANCE = new LiveCoHostCrossActiveFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHostCrossActiveFixSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
