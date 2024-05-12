package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30758C5i;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_alog_and_monitor_allow_list")
/* loaded from: classes6.dex */
public final class LiveALogAndMonitorDegradeAllowListSetting {
    public static final LiveALogAndMonitorDegradeAllowListSetting INSTANCE = new LiveALogAndMonitorDegradeAllowListSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveALogAndMonitorDegradeModel DEFAULT = new LiveALogAndMonitorDegradeModel(null, null, 3, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C30758C5i.LJLIL);

    public final LiveALogAndMonitorDegradeModel getSettingValue() {
        return (LiveALogAndMonitorDegradeModel) settingValue$delegate.getValue();
    }

    public final LiveALogAndMonitorDegradeModel getValue() {
        return getSettingValue();
    }

    public final LiveALogAndMonitorDegradeModel getDEFAULT() {
        return DEFAULT;
    }
}
