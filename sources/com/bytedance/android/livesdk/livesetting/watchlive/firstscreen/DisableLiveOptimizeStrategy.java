package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey("disable_live_pre_connection_opt")
/* loaded from: classes6.dex */
public final class DisableLiveOptimizeStrategy {
    public static final DisableLiveOptimizeStrategy INSTANCE = new DisableLiveOptimizeStrategy();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Boolean> DEFAULT = C113554cx.LJJJLIIL();

    public final Map<String, Boolean> getValue() {
        Map<String, Boolean> map = (Map) SettingsManager.INSTANCE.getValueSafely(DisableLiveOptimizeStrategy.class);
        if (map == null) {
            return C113554cx.LJJJLIIL();
        }
        return map;
    }

    public final Map<String, Boolean> getDEFAULT() {
        return DEFAULT;
    }
}
