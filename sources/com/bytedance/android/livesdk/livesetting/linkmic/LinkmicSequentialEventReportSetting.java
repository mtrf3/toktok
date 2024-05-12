package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sequential_event_report_conf")
/* loaded from: classes14.dex */
public final class LinkmicSequentialEventReportSetting {
    public static final LinkmicSequentialEventReportSetting INSTANCE = new LinkmicSequentialEventReportSetting();

    @Group(isDefault = true, value = "default group")
    public static final LinkmicSequentialEventReportConf DEFAULT = new LinkmicSequentialEventReportConf(false, 0, 0, 0, 0, 0, 63, null);

    public final LinkmicSequentialEventReportConf getValue() {
        LinkmicSequentialEventReportConf linkmicSequentialEventReportConf = (LinkmicSequentialEventReportConf) SettingsManager.INSTANCE.getValueSafely(LinkmicSequentialEventReportSetting.class);
        if (linkmicSequentialEventReportConf == null) {
            return DEFAULT;
        }
        return linkmicSequentialEventReportConf;
    }
}
