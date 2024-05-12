package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_post_recharge_sound_effect")
/* loaded from: classes6.dex */
public final class LiveGiftPostRechargeSoundEffectSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftPostRechargeSoundEffectSetting INSTANCE = new LiveGiftPostRechargeSoundEffectSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftPostRechargeSoundEffectSetting.class);
    }

    public final boolean enable() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }
}
