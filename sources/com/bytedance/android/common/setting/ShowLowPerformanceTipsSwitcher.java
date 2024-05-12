package com.bytedance.android.common.setting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("show_low_performance_tips")
/* loaded from: classes.dex */
public final class ShowLowPerformanceTipsSwitcher {
    public static final int $stable = 0;

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final ShowLowPerformanceTipsSwitcher INSTANCE = new ShowLowPerformanceTipsSwitcher();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(ShowLowPerformanceTipsSwitcher.class) == 1) {
            return true;
        }
        return false;
    }
}
