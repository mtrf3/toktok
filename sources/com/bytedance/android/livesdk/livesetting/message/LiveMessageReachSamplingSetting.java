package com.bytedance.android.livesdk.livesetting.message;

import X.C113554cx;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.Map;

@SettingsKey("live_message_reach_sampling")
/* loaded from: classes6.dex */
public final class LiveMessageReachSamplingSetting {
    public static final LiveMessageReachSamplingSetting INSTANCE = new LiveMessageReachSamplingSetting();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Float> DEFAULT = C113554cx.LJJJLIIL();

    public final Map<String, Object> getValue() {
        Map<String, Object> map = (Map) SettingsManager.INSTANCE.getValueSafely(LiveMessageReachSamplingSetting.class);
        if (map == null) {
            return DEFAULT;
        }
        return map;
    }

    public final Map<String, Float> getDEFAULT() {
        return DEFAULT;
    }
}
