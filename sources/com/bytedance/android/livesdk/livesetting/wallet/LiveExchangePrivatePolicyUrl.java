package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("exchange_us_privacy_policy_link")
/* loaded from: classes6.dex */
public final class LiveExchangePrivatePolicyUrl {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://www.tiktok.com/legal/privacy-policy-us?lang=en";
    public static final LiveExchangePrivatePolicyUrl INSTANCE = new LiveExchangePrivatePolicyUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveExchangePrivatePolicyUrl.class);
    }
}
