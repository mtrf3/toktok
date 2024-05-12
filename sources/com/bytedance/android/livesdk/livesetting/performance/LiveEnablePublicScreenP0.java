package com.bytedance.android.livesdk.livesetting.performance;

import X.BTC;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_enable_public_screen_p0")
/* loaded from: classes6.dex */
public final class LiveEnablePublicScreenP0 {

    @Group(isDefault = true, value = "default_group")
    public static final boolean DEFAULT = false;
    public static final LiveEnablePublicScreenP0 INSTANCE = new LiveEnablePublicScreenP0();
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(BTC.LJLIL);

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
