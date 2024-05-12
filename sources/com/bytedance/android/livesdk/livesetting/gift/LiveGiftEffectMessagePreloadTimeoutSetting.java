package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_effect_prefetch_timeout")
/* loaded from: classes6.dex */
public final class LiveGiftEffectMessagePreloadTimeoutSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 60;
    public static final LiveGiftEffectMessagePreloadTimeoutSetting INSTANCE = new LiveGiftEffectMessagePreloadTimeoutSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftEffectMessagePreloadTimeoutSetting.class);
    }
}
