package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.CYX;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_rank_optimize_setting")
/* loaded from: classes6.dex */
public final class RankOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final RankOptimizeSetting INSTANCE = new RankOptimizeSetting();
    public static final C5H3 configValue$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CYX.LJLIL);

    private final boolean getConfigValue() {
        return ((Boolean) configValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getConfigValue();
    }
}
