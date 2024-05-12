package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("cohost_sequential_event_report_conf")
/* loaded from: classes6.dex */
public final class CoHostSequentialEventReportSetting {
    public static final CoHostSequentialEventReportSetting INSTANCE = new CoHostSequentialEventReportSetting();

    @Group(isDefault = true, value = "default group")
    public static final CoHostSequentialEventReportConf DEFAULT = new CoHostSequentialEventReportConf(false, 1, null);

    public final CoHostSequentialEventReportConf getValue() {
        CoHostSequentialEventReportConf coHostSequentialEventReportConf = (CoHostSequentialEventReportConf) SettingsManager.INSTANCE.getValueSafely(CoHostSequentialEventReportSetting.class);
        if (coHostSequentialEventReportConf == null) {
            return DEFAULT;
        }
        return coHostSequentialEventReportConf;
    }
}
