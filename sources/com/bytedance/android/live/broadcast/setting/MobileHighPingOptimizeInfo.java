package com.bytedance.android.live.broadcast.setting;

import X.C221108m2;
import X.C47031sx;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("mobile_high_ping_optimize_config")
/* loaded from: classes.dex */
public final class MobileHighPingOptimizeInfo {
    public static final MobileHighPingOptimizeInfo INSTANCE = new MobileHighPingOptimizeInfo();

    @Group(isDefault = true, value = "default group")
    public static final MobileHighPingOptimizeConfig DEFAULT = new MobileHighPingOptimizeConfig(0, 0, 0, 0.0f, 15, null);
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C47031sx.LJLIL);
    public static final int $stable = 8;

    private final MobileHighPingOptimizeConfig getSettingValue() {
        return (MobileHighPingOptimizeConfig) settingValue$delegate.getValue();
    }

    public final MobileHighPingOptimizeConfig getValue() {
        return getSettingValue();
    }
}
