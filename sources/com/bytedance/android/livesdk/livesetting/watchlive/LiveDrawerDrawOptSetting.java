package com.bytedance.android.livesdk.livesetting.watchlive;

import X.B6F;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlive_drawer_draw_opt")
/* loaded from: classes6.dex */
public final class LiveDrawerDrawOptSetting {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveDrawerDrawOptSetting INSTANCE = new LiveDrawerDrawOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(B6F.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }

    public final boolean isOpt() {
        return getValue();
    }
}
