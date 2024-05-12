package com.bytedance.android.livesdk.livesetting.performance;

import X.BT5;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_enable_recycle_widget")
/* loaded from: classes6.dex */
public final class LiveRecycleWidgetSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRecycleWidgetSetting INSTANCE = new LiveRecycleWidgetSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(BT5.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
