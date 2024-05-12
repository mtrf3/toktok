package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.C5N;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_gc_optimize_v2")
/* loaded from: classes6.dex */
public final class LiveGCOptimizeSettingV2 {

    @Group(isDefault = true, value = "Online")
    public static final int DEFAULT = 0;

    @Group("Disable sei log ")
    public static final int DISABLE_SEI_LOG = 9;

    @Group("enable all opts")
    public static final int ENABLE_IN_ALL = 15;

    @Group("Enable jsb json opt v1")
    public static final int ENABLE_JSB_JSON_OPT = 5;

    @Group("Enable message opt")
    public static final int ENABLE_MESSAGE_OPT = 3;
    public static final LiveGCOptimizeSettingV2 INSTANCE = new LiveGCOptimizeSettingV2();

    @Group("Contrast group")
    public static final int ONLY_ENABLE_GC_OCCUPY = 1;
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C5N.LJLIL);

    public static final boolean disableSEILog() {
        return INSTANCE.isBitEnable(9);
    }

    public static final boolean enableGcOccupy() {
        if (INSTANCE.getValue() != DEFAULT) {
            return true;
        }
        return false;
    }

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public static final boolean isEnableJsbJsonOpt() {
        return INSTANCE.isBitEnable(5);
    }

    public static final boolean isEnableMessage() {
        return INSTANCE.isBitEnable(3);
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final int getONLY_ENABLE_GC_OCCUPY() {
        return ONLY_ENABLE_GC_OCCUPY;
    }

    private final boolean isBitEnable(int i) {
        if ((getValue() & i) == i) {
            return true;
        }
        return false;
    }
}
