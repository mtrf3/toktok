package com.bytedance.android.livesdk.livesetting.gift;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey("live_interactive_gift_schemes")
/* loaded from: classes6.dex */
public final class LynxUrlStorage {
    public static final LynxUrlStorage INSTANCE = new LynxUrlStorage();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, String> DEFAULT = C113554cx.LJJJLIIL();

    public final Map<String, String> getValue() {
        Map<String, String> map = (Map) SettingsManager.INSTANCE.getValueSafely(LynxUrlStorage.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final Map<String, String> getDEFAULT() {
        return DEFAULT;
    }
}
