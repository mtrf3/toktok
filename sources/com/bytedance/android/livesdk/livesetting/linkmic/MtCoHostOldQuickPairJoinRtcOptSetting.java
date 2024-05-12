package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_old_quickpair_join_rtc_opt")
/* loaded from: classes6.dex */
public final class MtCoHostOldQuickPairJoinRtcOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MtCoHostOldQuickPairJoinRtcOptSetting INSTANCE = new MtCoHostOldQuickPairJoinRtcOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostOldQuickPairJoinRtcOptSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
