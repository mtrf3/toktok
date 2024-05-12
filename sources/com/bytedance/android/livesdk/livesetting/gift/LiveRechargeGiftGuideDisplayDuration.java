package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_guide_recharged_show_duration")
/* loaded from: classes6.dex */
public final class LiveRechargeGiftGuideDisplayDuration {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 30;
    public static final LiveRechargeGiftGuideDisplayDuration INSTANCE = new LiveRechargeGiftGuideDisplayDuration();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveRechargeGiftGuideDisplayDuration.class);
    }
}
