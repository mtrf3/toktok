package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_wallet_currency_localise")
/* loaded from: classes11.dex */
public final class LiveWalletCurrencyLocaliseSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveWalletCurrencyLocaliseSetting INSTANCE = new LiveWalletCurrencyLocaliseSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveWalletCurrencyLocaliseSetting.class);
    }
}
