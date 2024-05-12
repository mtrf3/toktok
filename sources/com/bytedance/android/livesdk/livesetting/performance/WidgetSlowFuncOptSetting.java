package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30763C5n;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_widget_slow_func_opt")
/* loaded from: classes6.dex */
public final class WidgetSlowFuncOptSetting {

    @Group(isDefault = true, value = "Disabled")
    public static final boolean DEFAULT = false;

    @Group("Enable")
    public static final boolean ENABLE = true;
    public static final WidgetSlowFuncOptSetting INSTANCE = new WidgetSlowFuncOptSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C30763C5n.LJLIL);

    private final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public static final boolean isEnable() {
        return INSTANCE.getEnable();
    }
}
