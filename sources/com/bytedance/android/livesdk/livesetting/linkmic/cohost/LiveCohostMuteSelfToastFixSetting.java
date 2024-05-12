package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_mute_self_toast_fix_setting")
/* loaded from: classes6.dex */
public final class LiveCohostMuteSelfToastFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveCohostMuteSelfToastFixSetting INSTANCE = new LiveCohostMuteSelfToastFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostMuteSelfToastFixSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
