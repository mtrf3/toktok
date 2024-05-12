package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C221108m2;
import X.C28229B6b;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("smooth_enter_opt")
/* loaded from: classes6.dex */
public final class SmoothEnterOptSetting {

    @Group(isDefault = true, value = "control_group")
    public static final boolean DEFAULT = false;

    @Group("experimental_group")
    public static final boolean ENABLE = true;
    public static final SmoothEnterOptSetting INSTANCE = new SmoothEnterOptSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C28229B6b.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
