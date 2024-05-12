package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_performance_report_opt")
/* loaded from: classes6.dex */
public final class LinkMicPerformanceReportOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LinkMicPerformanceReportOptSetting INSTANCE = new LinkMicPerformanceReportOptSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicPerformanceReportOptSetting.class);
    }

    public final boolean useOpt() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
