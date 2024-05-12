package com.bytedance.android.livesdk.livesetting.wallet;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.HashMap;
import java.util.Map;

@SettingsKey("live_wallet_fallback")
/* loaded from: classes6.dex */
public final class LiveWalletFallbackSetting {
    public static final LiveWalletFallbackSetting INSTANCE = new LiveWalletFallbackSetting();

    @Group(isDefault = true, value = "default group")
    public static final HashMap<String, Boolean> DEFAULT = C113554cx.LJJJLZIJ(new OSZ("exchange_kyc", Boolean.FALSE));

    private final Map<String, Boolean> getValue() {
        Map<String, Boolean> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveWalletFallbackSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final boolean getExchangeKycFallback() {
        Boolean bool = getValue().get("exchange_kyc");
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
