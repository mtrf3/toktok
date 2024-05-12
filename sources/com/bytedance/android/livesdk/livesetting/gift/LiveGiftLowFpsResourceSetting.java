package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_lowfps_strategy")
/* loaded from: classes6.dex */
public final class LiveGiftLowFpsResourceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftLowFpsResourceSetting INSTANCE = new LiveGiftLowFpsResourceSetting();

    @Group("Strategy 1")
    public static final int STRATEGY1 = 1;

    @Group("Strategy 2")
    public static final int STRATEGY2 = 2;

    @Group("Strategy 3")
    public static final int STRATEGY3 = 3;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftLowFpsResourceSetting.class);
    }

    public final boolean alwaysUseTarget() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean enabled() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }

    public final boolean markNonTargeted() {
        if (getValue() >= 2) {
            return true;
        }
        return false;
    }

    public final boolean needDownloadWhenClean() {
        if (getValue() == 3) {
            return true;
        }
        return false;
    }
}
