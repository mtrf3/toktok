package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_guest_window_follow_button")
/* loaded from: classes6.dex */
public final class LivesdkLinkmicGuestWindowFollowButtonSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("follow button on nickname's left")
    public static final int FOLLOW_BUTTON_ON_NICKNAME_LEFT = 1;
    public static final LivesdkLinkmicGuestWindowFollowButtonSetting INSTANCE = new LivesdkLinkmicGuestWindowFollowButtonSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivesdkLinkmicGuestWindowFollowButtonSetting.class);
    }

    public final boolean isV1() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
