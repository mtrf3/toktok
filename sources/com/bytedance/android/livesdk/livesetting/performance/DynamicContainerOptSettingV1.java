package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.C5L;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("dynamic_container_goal_opt")
/* loaded from: classes6.dex */
public final class DynamicContainerOptSettingV1 {

    @Group("Enable all")
    public static final int ALL = 3;

    @Group("Enable async create")
    public static final int ASYNC_CREATE_GOAL = 1;

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("Enable fix size for goals wish list")
    public static final int FIX_LAYOUT = 2;
    public static final DynamicContainerOptSettingV1 INSTANCE = new DynamicContainerOptSettingV1();
    public static final C5H3 value$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C5L.LJLIL);

    public static final boolean enableAsyncGoal() {
        return INSTANCE.isBitEnable(1);
    }

    public static final boolean enableFixLayout() {
        return INSTANCE.isBitEnable(2);
    }

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    private final boolean isBitEnable(int i) {
        if ((getValue() & i) == i) {
            return true;
        }
        return false;
    }
}
