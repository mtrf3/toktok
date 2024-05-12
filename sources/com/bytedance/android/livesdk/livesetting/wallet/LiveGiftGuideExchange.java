package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enable_guide_gift_exchange")
/* loaded from: classes6.dex */
public final class LiveGiftGuideExchange {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveGiftGuideExchange INSTANCE = new LiveGiftGuideExchange();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveGiftGuideExchange.class);
    }
}
