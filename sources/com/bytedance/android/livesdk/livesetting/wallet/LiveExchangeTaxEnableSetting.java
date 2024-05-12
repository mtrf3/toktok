package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("should_request_tax")
/* loaded from: classes6.dex */
public final class LiveExchangeTaxEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveExchangeTaxEnableSetting INSTANCE = new LiveExchangeTaxEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveExchangeTaxEnableSetting.class);
    }
}
