package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C29994Bpu;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("like_effect_group")
/* loaded from: classes6.dex */
public final class LiveLikeDifferentialHeatSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveLikeDifferentialHeatSetting INSTANCE = new LiveLikeDifferentialHeatSetting();
    public static final C5H3 value$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C29994Bpu.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
