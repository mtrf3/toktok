package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_exclusive_fix")
/* loaded from: classes11.dex */
public final class LiveCoHostCrossExclusiveFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveCoHostCrossExclusiveFixSetting INSTANCE = new LiveCoHostCrossExclusiveFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHostCrossExclusiveFixSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
