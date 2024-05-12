package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sdk_logger_conf")
/* loaded from: classes6.dex */
public final class LinkMicLoggerSdkReportSetting {
    public static final LinkMicLoggerSdkReportSetting INSTANCE = new LinkMicLoggerSdkReportSetting();

    @Group(isDefault = true, value = "default group")
    public static final LinkMicLoggerReportConf DEFAULT = new LinkMicLoggerReportConf(false, null, 3, null);

    public final LinkMicLoggerReportConf getValue() {
        LinkMicLoggerReportConf linkMicLoggerReportConf = (LinkMicLoggerReportConf) SettingsManager.INSTANCE.getValueSafely(LinkMicLoggerSdkReportSetting.class);
        if (linkMicLoggerReportConf == null) {
            return DEFAULT;
        }
        return linkMicLoggerReportConf;
    }
}
