package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_cross_apply_full_fix_setting")
/* loaded from: classes6.dex */
public final class LiveCohostCrossApplyFullFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveCohostCrossApplyFullFixSetting INSTANCE = new LiveCohostCrossApplyFullFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostCrossApplyFullFixSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
