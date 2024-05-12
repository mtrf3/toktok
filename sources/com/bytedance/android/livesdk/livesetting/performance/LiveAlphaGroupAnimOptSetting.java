package com.bytedance.android.livesdk.livesetting.performance;

import X.C221108m2;
import X.C58574Myo;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_alpha_group_anim_opt")
/* loaded from: classes11.dex */
public final class LiveAlphaGroupAnimOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveAlphaGroupAnimOptSetting INSTANCE = new LiveAlphaGroupAnimOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C58574Myo.LJLIL);

    public final boolean getValue() {
        return ((Boolean) value$delegate.getValue()).booleanValue();
    }
}
