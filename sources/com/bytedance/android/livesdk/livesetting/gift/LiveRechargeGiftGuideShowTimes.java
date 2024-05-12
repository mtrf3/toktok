package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_guide_recharged_max_show_times")
/* loaded from: classes11.dex */
public final class LiveRechargeGiftGuideShowTimes {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 2;
    public static final LiveRechargeGiftGuideShowTimes INSTANCE = new LiveRechargeGiftGuideShowTimes();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveRechargeGiftGuideShowTimes.class);
    }
}
