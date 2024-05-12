package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58488MxQ;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_business_server_reporter_interval")
/* loaded from: classes11.dex */
public final class MultiGuestBusinessServerReporterIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 20;
    public static final MultiGuestBusinessServerReporterIntervalSetting INSTANCE = new MultiGuestBusinessServerReporterIntervalSetting();
    public static final C5H3 settingsKey$delegate = C221108m2.LIZIZ(C58488MxQ.LJLIL);

    private final int getSettingsKey() {
        return ((Number) settingsKey$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestBusinessServerReporterIntervalSetting.class);
    }

    public final int interval() {
        return getSettingsKey();
    }
}
