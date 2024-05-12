package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C5H3;
import X.C86868Y7k;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_preview_effect_strategy")
/* loaded from: classes16.dex */
public final class LiveGiftFeedEffectPlayExpSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftFeedEffectPlayExpSetting INSTANCE;
    public static final boolean corner;
    public static final boolean disable;
    public static final boolean full;
    public static final C5H3 type$delegate;

    static {
        boolean z;
        boolean z2;
        LiveGiftFeedEffectPlayExpSetting liveGiftFeedEffectPlayExpSetting = new LiveGiftFeedEffectPlayExpSetting();
        INSTANCE = liveGiftFeedEffectPlayExpSetting;
        type$delegate = C221108m2.LIZIZ(C86868Y7k.LJLIL);
        boolean z3 = false;
        if (liveGiftFeedEffectPlayExpSetting.getType() == DEFAULT) {
            z = true;
        } else {
            z = false;
        }
        disable = z;
        if (liveGiftFeedEffectPlayExpSetting.getType() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        full = z2;
        if (liveGiftFeedEffectPlayExpSetting.getType() == 2) {
            z3 = true;
        }
        corner = z3;
    }

    public final int getType() {
        return ((Number) type$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftFeedEffectPlayExpSetting.class);
    }

    public final boolean getCorner() {
        return corner;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getDisable() {
        return disable;
    }

    public final boolean getFull() {
        return full;
    }
}
