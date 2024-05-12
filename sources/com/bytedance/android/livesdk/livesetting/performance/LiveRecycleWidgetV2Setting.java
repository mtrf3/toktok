package com.bytedance.android.livesdk.livesetting.performance;

import X.B74;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_enable_recycle_widget_v2")
/* loaded from: classes6.dex */
public final class LiveRecycleWidgetV2Setting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRecycleWidgetV2Setting INSTANCE = new LiveRecycleWidgetV2Setting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(B74.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
