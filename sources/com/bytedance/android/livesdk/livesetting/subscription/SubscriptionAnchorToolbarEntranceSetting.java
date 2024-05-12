package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_subscription_toolbar_entrance")
/* loaded from: classes6.dex */
public final class SubscriptionAnchorToolbarEntranceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final SubscriptionAnchorToolbarEntranceSetting INSTANCE = new SubscriptionAnchorToolbarEntranceSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(SubscriptionAnchorToolbarEntranceSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }
}
