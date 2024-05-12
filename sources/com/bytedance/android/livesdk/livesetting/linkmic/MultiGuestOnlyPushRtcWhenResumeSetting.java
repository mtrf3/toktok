package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_only_push_rtc_when_resume")
/* loaded from: classes6.dex */
public final class MultiGuestOnlyPushRtcWhenResumeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("only push rtc when resume broadcast")
    public static final int ENABLE = 1;
    public static final MultiGuestOnlyPushRtcWhenResumeSetting INSTANCE = new MultiGuestOnlyPushRtcWhenResumeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestOnlyPushRtcWhenResumeSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
