package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("wallet_tax_api_migrate")
/* loaded from: classes6.dex */
public final class LiveWalletTaxAPI {
    public static final LiveWalletTaxAPI INSTANCE = new LiveWalletTaxAPI();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveWalletTaxAPI.class);
    }
}
