package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_effect_house")
/* loaded from: classes6.dex */
public final class LiveEffectHouseEffectSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEffectHouseEffectSetting INSTANCE = new LiveEffectHouseEffectSetting();
    public static final int settingValue = SettingsManager.INSTANCE.getIntValue(LiveEffectHouseEffectSetting.class);

    public final boolean shouldFilterEffectHouseEffects() {
        int i = settingValue;
        if (i == 0 || i == 1) {
            return true;
        }
        return false;
    }

    public final boolean shouldShowInfo() {
        int i = settingValue;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }
}
