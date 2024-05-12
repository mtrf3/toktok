package com.bytedance.android.live.broadcast.setting;

import X.C221108m2;
import X.C47021sw;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("high_ping_adjust_bitrate")
/* loaded from: classes.dex */
public final class MobileHighPingAdjustBitrateInfo {
    public static final MobileHighPingAdjustBitrateInfo INSTANCE = new MobileHighPingAdjustBitrateInfo();

    @Group(isDefault = true, value = "default group")
    public static final MobileHighPingAdjustBitrateConfig DEFAULT = new MobileHighPingAdjustBitrateConfig(0, 0, 0, 0, 0.0f, 0.0f, 0.0f, 127, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C47021sw.LJLIL);
    public static final int $stable = 8;

    private final MobileHighPingAdjustBitrateConfig getSettingValue() {
        return (MobileHighPingAdjustBitrateConfig) settingValue$delegate.getValue();
    }

    public final MobileHighPingAdjustBitrateConfig getValue() {
        return getSettingValue();
    }

    public final boolean isEnableAdjustBitrateScope() {
        if (getValue().getHigh_ping_adjust_bitrate_scope() == 1) {
            return true;
        }
        return false;
    }
}
