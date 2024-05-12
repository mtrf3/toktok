package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C58531My7;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("gift_combo_interrupt_type")
/* loaded from: classes11.dex */
public final class LiveGiftComboInterruptStrategySettings {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftComboInterruptStrategySettings INSTANCE = new LiveGiftComboInterruptStrategySettings();
    public static final C5H3 strategy$delegate = C221108m2.LIZIZ(C58531My7.LJLIL);

    public final int getStrategy() {
        return ((Number) strategy$delegate.getValue()).intValue();
    }

    public final int getOtherSideStrategy() {
        int strategy = getStrategy();
        if (strategy == 0) {
            return 0;
        }
        if (strategy != 1) {
            if (strategy == 2) {
                return 0;
            }
            if (strategy != 3 && strategy != 4) {
                return 0;
            }
            return 1;
        }
        return 2;
    }

    public final int getSelfSideStrategy() {
        int strategy = getStrategy();
        if (strategy == 0 || strategy == 1) {
            return 0;
        }
        if (strategy != 2 && (strategy == 3 || strategy != 4)) {
            return 0;
        }
        return 1;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
