package com.bytedance.android.livesdk.livesetting.gift;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.List;
import java.util.Map;

@SettingsKey("live_gift_tray_price_color")
/* loaded from: classes6.dex */
public final class LiveGiftTrayPriceColorSetting {
    public static final LiveGiftTrayPriceColorSetting INSTANCE = new LiveGiftTrayPriceColorSetting();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, List<String>> DEFAULT = C113554cx.LJJJLIIL();

    public final Map<String, List<String>> getValue() {
        Map<String, List<String>> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveGiftTrayPriceColorSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final Map<String, List<String>> getDEFAULT() {
        return DEFAULT;
    }
}
