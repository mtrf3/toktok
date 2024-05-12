package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58505Mxh;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_business_server_reporter_opt")
/* loaded from: classes11.dex */
public final class MultiGuestBusinessServerReporterOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final MultiGuestBusinessServerReporterOptSetting INSTANCE = new MultiGuestBusinessServerReporterOptSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C58505Mxh.LJLIL);

    private final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestBusinessServerReporterOptSetting.class);
    }

    public final boolean isOpt() {
        if (getSettingValue() == 1) {
            return true;
        }
        return false;
    }
}