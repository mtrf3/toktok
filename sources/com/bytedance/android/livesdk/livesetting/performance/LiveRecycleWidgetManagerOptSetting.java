package com.bytedance.android.livesdk.livesetting.performance;

import X.B64;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_recycle_widget_manager_opt")
/* loaded from: classes6.dex */
public final class LiveRecycleWidgetManagerOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRecycleWidgetManagerOptSetting INSTANCE = new LiveRecycleWidgetManagerOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(B64.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
