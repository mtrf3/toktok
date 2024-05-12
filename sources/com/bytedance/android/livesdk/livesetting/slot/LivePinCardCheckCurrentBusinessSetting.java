package com.bytedance.android.livesdk.livesetting.slot;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_pin_card_check_current_business_setting")
/* loaded from: classes6.dex */
public final class LivePinCardCheckCurrentBusinessSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivePinCardCheckCurrentBusinessSetting INSTANCE = new LivePinCardCheckCurrentBusinessSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePinCardCheckCurrentBusinessSetting.class);
    }
}
