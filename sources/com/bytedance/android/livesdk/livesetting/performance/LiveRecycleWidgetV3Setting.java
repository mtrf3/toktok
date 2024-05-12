package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C28303B8x;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_enable_recycle_widget_v3")
/* loaded from: classes6.dex */
public final class LiveRecycleWidgetV3Setting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRecycleWidgetV3Setting INSTANCE = new LiveRecycleWidgetV3Setting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C28303B8x.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
