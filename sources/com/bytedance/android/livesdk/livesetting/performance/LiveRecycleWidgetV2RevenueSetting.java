package com.bytedance.android.livesdk.livesetting.performance;

import X.BRT;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_enable_recycle_revenue_widget_v2")
/* loaded from: classes6.dex */
public final class LiveRecycleWidgetV2RevenueSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRecycleWidgetV2RevenueSetting INSTANCE = new LiveRecycleWidgetV2RevenueSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(BRT.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
