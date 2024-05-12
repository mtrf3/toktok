package com.bytedance.android.livesdk.livesetting.pullstream;

import X.B66;
import X.C221108m2;
import X.C5H3;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("surfaceview_unexpected_wh_setting")
/* loaded from: classes6.dex */
public final class SurfaceViewUnExpectedWHSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final SurfaceViewUnExpectedWHSetting INSTANCE = new SurfaceViewUnExpectedWHSetting();
    public static final C5H3 value$delegate = C221108m2.LIZ(EnumC221088m0.NONE, B66.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
