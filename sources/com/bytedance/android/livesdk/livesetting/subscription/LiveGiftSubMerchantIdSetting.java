package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_sub_gift_merchant_id")
/* loaded from: classes6.dex */
public final class LiveGiftSubMerchantIdSetting {
    public static final LiveGiftSubMerchantIdSetting INSTANCE = new LiveGiftSubMerchantIdSetting();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "05816USpPkJiyBnttk";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveGiftSubMerchantIdSetting.class);
    }
}
