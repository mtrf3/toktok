package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_report_optimize_url")
/* loaded from: classes6.dex */
public final class LiveReportOptimizeUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveReportOptimizeUrlSetting INSTANCE = new LiveReportOptimizeUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveReportOptimizeUrlSetting.class);
    }
}
