package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.C5M;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_alog_and_monitor_degrade_switch")
/* loaded from: classes6.dex */
public final class LiveALogAndMonitorDegradeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveALogAndMonitorDegradeSetting INSTANCE = new LiveALogAndMonitorDegradeSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C5M.LJLIL);

    @Group("ALog")
    public static final int v1 = 1;

    @Group("ALogAndMonitor")
    public static final int v2 = 2;

    public final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return getSettingValue();
    }
}
