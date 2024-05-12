package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C30877C9x;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_draw_opt")
/* loaded from: classes6.dex */
public final class LiveDrawOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveDrawOptSetting INSTANCE = new LiveDrawOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C30877C9x.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
