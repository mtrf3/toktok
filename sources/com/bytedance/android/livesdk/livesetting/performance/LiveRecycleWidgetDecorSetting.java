package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30059Bqx;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_enable_recycle_decor_widget")
/* loaded from: classes6.dex */
public final class LiveRecycleWidgetDecorSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRecycleWidgetDecorSetting INSTANCE = new LiveRecycleWidgetDecorSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30059Bqx.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
