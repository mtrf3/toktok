package com.bytedance.android.livesdk.livesetting.broadcast;

import X.C221108m2;
import X.C28256B7c;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_effect_has_name")
/* loaded from: classes6.dex */
public final class LiveEffectHasNameSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEffectHasNameSetting INSTANCE = new LiveEffectHasNameSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C28256B7c.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean enable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
