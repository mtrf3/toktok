package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_auto_exchange")
/* loaded from: classes6.dex */
public final class LiveAutoExchangeABTestSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveAutoExchangeABTestSetting INSTANCE = new LiveAutoExchangeABTestSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAutoExchangeABTestSetting.class);
    }
}
