package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("report_urls")
/* loaded from: classes6.dex */
public final class LiveEffectReportUrlSetting {
    public static final LiveEffectReportUrlSetting INSTANCE = new LiveEffectReportUrlSetting();

    @Group(isDefault = true, value = "default group")
    public static final ReportFeedbackUrls DEFAULT = new ReportFeedbackUrls(null, null, 3, null);
    public static final ReportFeedbackUrls setting = (ReportFeedbackUrls) SettingsManager.INSTANCE.getValueSafely(LiveEffectReportUrlSetting.class);

    public final String getReportCreatorUrl() {
        String str;
        ReportFeedbackUrls reportFeedbackUrls = setting;
        if (reportFeedbackUrls == null || (str = reportFeedbackUrls.reportCreatorUrl) == null) {
            return DEFAULT.reportCreatorUrl;
        }
        return str;
    }

    public final String getReportOfficialUrl() {
        String str;
        ReportFeedbackUrls reportFeedbackUrls = setting;
        if (reportFeedbackUrls == null || (str = reportFeedbackUrls.reportOfficialUrl) == null) {
            return DEFAULT.reportOfficialUrl;
        }
        return str;
    }
}
