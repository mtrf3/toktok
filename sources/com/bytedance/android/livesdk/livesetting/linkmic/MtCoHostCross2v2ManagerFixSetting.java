package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_cross_2v2_manager_fix")
/* loaded from: classes6.dex */
public final class MtCoHostCross2v2ManagerFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MtCoHostCross2v2ManagerFixSetting INSTANCE = new MtCoHostCross2v2ManagerFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MtCoHostCross2v2ManagerFixSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
