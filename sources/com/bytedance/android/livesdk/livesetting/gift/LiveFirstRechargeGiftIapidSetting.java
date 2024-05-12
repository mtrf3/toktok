package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_first_recharge_gift_iapid")
/* loaded from: classes11.dex */
public final class LiveFirstRechargeGiftIapidSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveFirstRechargeGiftIapidSetting INSTANCE = new LiveFirstRechargeGiftIapidSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveFirstRechargeGiftIapidSetting.class);
    }
}
