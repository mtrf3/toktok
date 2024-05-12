package com.bytedance.android.livesdk.livesetting.other.subscribe;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("sub_icon_hide_text_minimum_dimension")
/* loaded from: classes6.dex */
public final class SubscriptionIconHideTextMinimumDimensionSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 390;
    public static final SubscriptionIconHideTextMinimumDimensionSetting INSTANCE = new SubscriptionIconHideTextMinimumDimensionSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(SubscriptionIconHideTextMinimumDimensionSetting.class);
    }
}
