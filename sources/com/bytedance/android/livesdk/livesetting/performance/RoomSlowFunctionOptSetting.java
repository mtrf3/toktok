package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C5H3;
import X.C5Q;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_room_slow_function_opt_setting")
/* loaded from: classes6.dex */
public final class RoomSlowFunctionOptSetting {

    @Group(isDefault = true, value = "Disabled")
    public static final int DEFAULT = 0;

    @Group("enable all opts")
    public static final int ENABLE_IN_ALL = 3;

    @Group("Enable room build")
    public static final int ENABLE_ROOM_BUILD = 1;

    @Group("Enable watch room")
    public static final int ENABLE_WATCH_ROOM = 2;
    public static final RoomSlowFunctionOptSetting INSTANCE = new RoomSlowFunctionOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C5Q.LJLIL);

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public static final boolean roomBuildOpt() {
        return INSTANCE.isBitEnable(1);
    }

    public static final boolean watchOpt() {
        return INSTANCE.isBitEnable(2);
    }

    private final boolean isBitEnable(int i) {
        if ((getValue() & i) == i) {
            return true;
        }
        return false;
    }
}
