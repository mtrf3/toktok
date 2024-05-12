package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.B6E;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("view_auto_preload_opt")
/* loaded from: classes6.dex */
public final class ViewAutoPreloadOptSetting {

    @Group(isDefault = true, value = "control_group")
    public static final boolean DEFAULT = false;

    @Group("experimental_group")
    public static final boolean ENABLE = true;
    public static final ViewAutoPreloadOptSetting INSTANCE = new ViewAutoPreloadOptSetting();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(B6E.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
