package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_recharge_age_threshold")
/* loaded from: classes6.dex */
public final class LiveRechargeAgeThresholdSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 18;
    public static final LiveRechargeAgeThresholdSetting INSTANCE = new LiveRechargeAgeThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveRechargeAgeThresholdSetting.class);
    }
}
