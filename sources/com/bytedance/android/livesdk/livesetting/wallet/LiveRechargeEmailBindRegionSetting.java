package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("recharge_should_bind_email")
/* loaded from: classes6.dex */
public final class LiveRechargeEmailBindRegionSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRechargeEmailBindRegionSetting INSTANCE = new LiveRechargeEmailBindRegionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveRechargeEmailBindRegionSetting.class);
    }
}
