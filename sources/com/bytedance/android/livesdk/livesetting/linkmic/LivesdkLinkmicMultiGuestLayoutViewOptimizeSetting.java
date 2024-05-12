package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58501Mxd;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_multi_guest_layout_view_optimize")
/* loaded from: classes11.dex */
public final class LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting INSTANCE = new LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C58501Mxd.LJLIL);

    private final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean enable() {
        return getValue();
    }
}
