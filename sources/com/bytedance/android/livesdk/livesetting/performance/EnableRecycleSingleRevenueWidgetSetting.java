package com.bytedance.android.livesdk.livesetting.performance;

import X.BRS;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("enable_recycle_single_revenue_widget")
/* loaded from: classes6.dex */
public final class EnableRecycleSingleRevenueWidgetSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableRecycleSingleRevenueWidgetSetting INSTANCE = new EnableRecycleSingleRevenueWidgetSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(BRS.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
