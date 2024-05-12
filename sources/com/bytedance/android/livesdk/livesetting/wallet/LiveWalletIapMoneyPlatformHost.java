package com.bytedance.android.livesdk.livesetting.wallet;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey("wallet_iap_configuration")
/* loaded from: classes6.dex */
public final class LiveWalletIapMoneyPlatformHost {
    public static final LiveWalletIapMoneyPlatformHost INSTANCE = new LiveWalletIapMoneyPlatformHost();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Object> DEFAULT = C113554cx.LJJJLIIL();

    public final Map<String, Object> getValue() {
        Map<String, Object> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveWalletIapMoneyPlatformHost.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }
}
