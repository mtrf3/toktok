package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_wallet_exchange_guide_type")
/* loaded from: classes6.dex */
public final class LiveWalletRechargeExchangeStrengthen {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "online";
    public static final LiveWalletRechargeExchangeStrengthen INSTANCE = new LiveWalletRechargeExchangeStrengthen();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveWalletRechargeExchangeStrengthen.class);
    }
}
