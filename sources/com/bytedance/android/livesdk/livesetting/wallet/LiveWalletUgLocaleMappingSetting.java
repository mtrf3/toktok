package com.bytedance.android.livesdk.livesetting.wallet;

import X.C113554cx;
import X.OSZ;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;
import ujb.o;

@SettingsKey("live_wallet_ug_locale_mapping")
/* loaded from: classes6.dex */
public final class LiveWalletUgLocaleMappingSetting {
    public static final LiveWalletUgLocaleMappingSetting INSTANCE = new LiveWalletUgLocaleMappingSetting();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, String> DEFAULT = C113554cx.LJJL(new OSZ("BRL", "pt-BR"), new OSZ("JPY", "ja-JP"), new OSZ("IDR", "id-ID"));

    private final Map<String, String> convertUnderscores() {
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveWalletUgLocaleMappingSetting.class);
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                map.put(entry.getKey(), o.LJJJJZ(entry.getValue(), "_", "-", false));
            }
        }
        return map;
    }

    public final Map<String, String> getValue() {
        Map<String, String> convertUnderscores = convertUnderscores();
        if (convertUnderscores == null) {
            return DEFAULT;
        }
        return convertUnderscores;
    }
}
