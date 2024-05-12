package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_monitor_report_opt")
/* loaded from: classes6.dex */
public final class LiveMonitorReportSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveMonitorReportSetting INSTANCE = new LiveMonitorReportSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMonitorReportSetting.class);
    }
}
