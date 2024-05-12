package com.bytedance.android.livesdk.livesetting.other;

import X.B6Q;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "ttlive_game_other_background_image_optimize")
/* loaded from: classes6.dex */
public final class TtliveGameOtherBackgroundImageOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("experiment group1")
    public static final int GROUP1 = 1;

    @Group("experiment group2")
    public static final int GROUP2 = 2;
    public static final TtliveGameOtherBackgroundImageOptimizeSetting INSTANCE = new TtliveGameOtherBackgroundImageOptimizeSetting();
    public static final C5H3 lazyValue$delegate = C221108m2.LIZIZ(B6Q.LJLIL);

    private final int getLazyValue() {
        return ((Number) lazyValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return getLazyValue();
    }

    public final boolean isBackgroundImmutable() {
        if (getLazyValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isBackgroundLightSensitiveBlack() {
        if (getLazyValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isBackgroundPureBlack() {
        if (getLazyValue() == 1) {
            return true;
        }
        return false;
    }
}
