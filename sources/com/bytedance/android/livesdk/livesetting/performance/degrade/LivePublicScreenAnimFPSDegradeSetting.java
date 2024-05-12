package com.bytedance.android.livesdk.livesetting.performance.degrade;

import X.C221108m2;
import X.C5H3;
import X.C5R;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_public_screen_anim_fps_degrade")
/* loaded from: classes6.dex */
public final class LivePublicScreenAnimFPSDegradeSetting {
    public static final LivePublicScreenAnimFPSDegradeSetting INSTANCE = new LivePublicScreenAnimFPSDegradeSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;

    @Group("degrade 20%")
    public static final int DEGRADE_20P = 5;

    @Group("degrade 33%")
    public static final int DEGRADE_30P = 3;

    @Group("degrade 50%")
    public static final int DEGRADE_50P = 2;
    public static final C5H3 value$delegate = C221108m2.LIZIZ(C5R.LJLIL);

    public final int getValue() {
        return ((Number) value$delegate.getValue()).intValue();
    }

    public final boolean enablePublicScreenItemAnimFPSDegrade() {
        if (getValue() > DEFAULT) {
            return true;
        }
        return false;
    }

    public final int getDEGRADE_20P() {
        return DEGRADE_20P;
    }

    public final int getDEGRADE_30P() {
        return DEGRADE_30P;
    }

    public final int getDEGRADE_50P() {
        return DEGRADE_50P;
    }
}
