package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30084BrM;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_enable_recycle_widget_v4")
/* loaded from: classes6.dex */
public final class LiveEnableRecycleWidgetV4 {

    @Group(isDefault = true, value = "default_group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableRecycleWidgetV4 INSTANCE = new LiveEnableRecycleWidgetV4();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C30084BrM.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }

    public final boolean isDisable() {
        return !getEnable();
    }

    public final boolean isEnable() {
        return getEnable();
    }
}
