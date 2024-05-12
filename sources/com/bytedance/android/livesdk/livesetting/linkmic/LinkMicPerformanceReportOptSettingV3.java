package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_performance_report_opt_v3")
/* loaded from: classes6.dex */
public final class LinkMicPerformanceReportOptSettingV3 {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LinkMicPerformanceReportOptSettingV3 INSTANCE = new LinkMicPerformanceReportOptSettingV3();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicPerformanceReportOptSettingV3.class);
    }

    public final boolean useOpt() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
