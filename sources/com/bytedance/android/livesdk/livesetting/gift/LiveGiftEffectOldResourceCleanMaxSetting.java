package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("gift_effect_old_resource_clean_batch_maxnum")
/* loaded from: classes6.dex */
public final class LiveGiftEffectOldResourceCleanMaxSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 5;
    public static final LiveGiftEffectOldResourceCleanMaxSetting INSTANCE = new LiveGiftEffectOldResourceCleanMaxSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftEffectOldResourceCleanMaxSetting.class);
    }
}
