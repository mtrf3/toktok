package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_linkmic_message_reporter")
/* loaded from: classes6.dex */
public final class EnableLinkmicMessageReporterSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EnableLinkmicMessageReporterSetting INSTANCE = new EnableLinkmicMessageReporterSetting();

    @Group("business server report v1 in liveinteract")
    public static final int REPORT_V1 = 1;

    @Group("business server report v2 in linkcore")
    public static final int REPORT_V2 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(EnableLinkmicMessageReporterSetting.class);
    }

    public final boolean isReportV1() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean isReportV2() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
