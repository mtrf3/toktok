package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.CacheLevel;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(cacheLevel = CacheLevel.DID, preciseExperiment = true, value = "gift_degradation264_strategy")
/* loaded from: classes6.dex */
public final class LiveGiftDegradation264ResourceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftDegradation264ResourceSetting INSTANCE = new LiveGiftDegradation264ResourceSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftDegradation264ResourceSetting.class);
    }

    public static final boolean enableOsPlayerForAudience() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean enableDegradation264() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }
}
