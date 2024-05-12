package com.bytedance.android.livesdk.livesetting.banner;

import X.B6Z;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "effect_memory_position_opt")
/* loaded from: classes6.dex */
public final class EffectMemoryPositionOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EffectMemoryPositionOptSetting INSTANCE = new EffectMemoryPositionOptSetting();
    public static final C5H3 value$delegate = C221108m2.LIZIZ(B6Z.LJLIL);

    private final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean inExperiment() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean v2() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }
}
