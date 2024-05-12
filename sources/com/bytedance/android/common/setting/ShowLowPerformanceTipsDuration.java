package com.bytedance.android.common.setting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("show_low_performance_tips_inapp_duartion_time")
/* loaded from: classes.dex */
public final class ShowLowPerformanceTipsDuration {
    public static final int $stable = 0;

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 180;
    public static final ShowLowPerformanceTipsDuration INSTANCE = new ShowLowPerformanceTipsDuration();

    public final int getDuration() {
        return SettingsManager.INSTANCE.getIntValue(ShowLowPerformanceTipsDuration.class);
    }
}
