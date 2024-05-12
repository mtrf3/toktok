package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_guest_follow_button_opt")
/* loaded from: classes6.dex */
public final class LivesdkLinkmicGuestFollowButtonOptSetting {

    @Group(isDefault = true, value = "guest not performance and ui opt")
    public static final int DEFAULT = 0;

    @Group("guest delete background")
    public static final int GUEST_DELETE_BACKGROUND = 3;

    @Group("guest with performance and ui opt")
    public static final int GUEST_WITH_PERFORMANCE_AND_UI_OPT = 2;

    @Group("guest with performance not ui opt")
    public static final int GUEST_WITH_PERFORMANCE_NOT_UI_OPT = 1;
    public static final LivesdkLinkmicGuestFollowButtonOptSetting INSTANCE = new LivesdkLinkmicGuestFollowButtonOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivesdkLinkmicGuestFollowButtonOptSetting.class);
    }

    public final boolean isV1() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isV2() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean isV3() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isV4() {
        if (getValue() == 3) {
            return true;
        }
        return false;
    }
}
