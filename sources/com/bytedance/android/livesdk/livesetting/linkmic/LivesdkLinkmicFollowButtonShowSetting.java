package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_follow_button_show")
/* loaded from: classes6.dex */
public final class LivesdkLinkmicFollowButtonShowSetting {

    @Group(isDefault = true, value = "Guest NotShow Follow Button")
    public static final int DEFAULT = 0;

    @Group("Guest Show Follow Button")
    public static final int GUEST_SHOW_FOLLOW_BUTTON = 1;
    public static final LivesdkLinkmicFollowButtonShowSetting INSTANCE = new LivesdkLinkmicFollowButtonShowSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivesdkLinkmicFollowButtonShowSetting.class);
    }

    public final boolean isShowFollowButton() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
