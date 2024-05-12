package com.bytedance.android.livesdk.livesetting.performance;

import X.BT2;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("enable_recycle_widget_view")
/* loaded from: classes6.dex */
public final class EnableLiveRecycleWidgetView {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final EnableLiveRecycleWidgetView INSTANCE = new EnableLiveRecycleWidgetView();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(BT2.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
