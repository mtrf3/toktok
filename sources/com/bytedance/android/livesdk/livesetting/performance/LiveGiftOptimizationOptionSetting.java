package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C58462Mx0;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("gift_guide_optimization_option")
/* loaded from: classes11.dex */
public final class LiveGiftOptimizationOptionSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftOptimizationOptionSetting INSTANCE = new LiveGiftOptimizationOptionSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C58462Mx0.LJLIL);

    private final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return getSettingValue();
    }
}
