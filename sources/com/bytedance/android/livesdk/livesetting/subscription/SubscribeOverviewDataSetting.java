package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_subscription_data_management")
/* loaded from: classes6.dex */
public final class SubscribeOverviewDataSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final SubscribeOverviewDataSetting INSTANCE = new SubscribeOverviewDataSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(SubscribeOverviewDataSetting.class);
    }

    public final boolean enableOverviewDataModule() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }
}
