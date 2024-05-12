package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscription_pin_card_anchor")
/* loaded from: classes6.dex */
public final class SubscriptionPinCardAnchorSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final SubscriptionPinCardAnchorSetting INSTANCE = new SubscriptionPinCardAnchorSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(SubscriptionPinCardAnchorSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
