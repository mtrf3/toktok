package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("livesdk_subscription_short_pay")
/* loaded from: classes6.dex */
public final class SubscribeShortPaySetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final SubscribeShortPaySetting INSTANCE = new SubscribeShortPaySetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(SubscribeShortPaySetting.class);
    }
}
