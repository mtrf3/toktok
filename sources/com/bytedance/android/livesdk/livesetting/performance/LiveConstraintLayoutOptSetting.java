package com.bytedance.android.livesdk.livesetting.performance;

import X.B6J;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_constraint_layout_opt")
/* loaded from: classes6.dex */
public final class LiveConstraintLayoutOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("enable double measure optimize")
    public static final int ENABLE_DOUBLE_MEASURE = 1;

    @Group("enable double solve linear system optimize")
    public static final int ENABLE_DOUBLE_SOLVE_LINEAR_SYSTEM = 2;

    @Group("enable all optimize")
    public static final int ENABLE_IN_ALL = 3;
    public static final LiveConstraintLayoutOptSetting INSTANCE = new LiveConstraintLayoutOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(B6J.LJLIL);

    public static final boolean enableDoubleMeasure() {
        if ((INSTANCE.getValue() & 1) == 1) {
            return true;
        }
        return false;
    }

    public static final boolean enableDoubleSolve() {
        if ((INSTANCE.getValue() & 2) == 2) {
            return true;
        }
        return false;
    }

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }
}
