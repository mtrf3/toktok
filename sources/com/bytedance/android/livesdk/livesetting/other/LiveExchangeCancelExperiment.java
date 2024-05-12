package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_wallet_auto_exchange_dialog_dont_show_again")
/* loaded from: classes14.dex */
public final class LiveExchangeCancelExperiment {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveExchangeCancelExperiment INSTANCE = new LiveExchangeCancelExperiment();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveExchangeCancelExperiment.class);
    }
}
