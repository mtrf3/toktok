package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_host_i_moderate_entrance_setting")
/* loaded from: classes6.dex */
public final class LiveHostIModerateEntranceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveHostIModerateEntranceSetting INSTANCE = new LiveHostIModerateEntranceSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveHostIModerateEntranceSetting.class);
    }

    public final boolean showEntrance() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
