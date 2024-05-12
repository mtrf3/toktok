package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("livesdk_linkmic_real_display_report")
/* loaded from: classes6.dex */
public final class LivesdkLinkmicRealDisplayReportSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivesdkLinkmicRealDisplayReportSetting INSTANCE = new LivesdkLinkmicRealDisplayReportSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LivesdkLinkmicRealDisplayReportSetting.class);
    }
}
