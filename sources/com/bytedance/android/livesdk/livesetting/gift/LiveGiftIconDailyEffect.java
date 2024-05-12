package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_icon_daily_animation_enable")
/* loaded from: classes6.dex */
public final class LiveGiftIconDailyEffect {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = true;
    public static final LiveGiftIconDailyEffect INSTANCE = new LiveGiftIconDailyEffect();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftIconDailyEffect.class);
    }
}
