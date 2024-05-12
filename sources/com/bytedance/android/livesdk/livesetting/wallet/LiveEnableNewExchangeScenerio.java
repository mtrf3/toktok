package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_wallet_enable_new_exchange_scenarios")
/* loaded from: classes6.dex */
public final class LiveEnableNewExchangeScenerio {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableNewExchangeScenerio INSTANCE = new LiveEnableNewExchangeScenerio();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableNewExchangeScenerio.class);
    }
}
