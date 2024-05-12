package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_wallet_exchange_cancel_limit")
/* loaded from: classes14.dex */
public final class LiveExchangeCancelLimit {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 2;
    public static final LiveExchangeCancelLimit INSTANCE = new LiveExchangeCancelLimit();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveExchangeCancelLimit.class);
    }
}
