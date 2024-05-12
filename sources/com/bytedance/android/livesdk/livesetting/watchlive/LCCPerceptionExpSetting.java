package com.bytedance.android.livesdk.livesetting.watchlive;

import X.B72;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_lcc_enable")
/* loaded from: classes6.dex */
public final class LCCPerceptionExpSetting {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LCCPerceptionExpSetting INSTANCE = new LCCPerceptionExpSetting();
    public static final C5H3 lccEnable$delegate = C221108m2.LIZIZ(B72.LJLIL);

    public final boolean getLccEnable() {
        return ((Boolean) lccEnable$delegate.getValue()).booleanValue();
    }
}
