package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_exchange_confirm_threshold")
/* loaded from: classes11.dex */
public final class LiveExchangeConfirmThreshold {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 50000;
    public static final LiveExchangeConfirmThreshold INSTANCE = new LiveExchangeConfirmThreshold();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveExchangeConfirmThreshold.class);
    }
}
