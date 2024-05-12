package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_multi_userinfo_fix_setting")
/* loaded from: classes6.dex */
public final class LiveCohostMultiUserInfoFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveCohostMultiUserInfoFixSetting INSTANCE = new LiveCohostMultiUserInfoFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostMultiUserInfoFixSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
