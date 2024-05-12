package com.bytedance.android.livesdk.livesetting.performance;

import X.BT4;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_enable_recycle_p0_widget")
/* loaded from: classes6.dex */
public final class LiveEnableRecycleP0Widget {

    @Group(isDefault = true, value = "default_group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableRecycleP0Widget INSTANCE = new LiveEnableRecycleP0Widget();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(BT4.LJLIL);

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
