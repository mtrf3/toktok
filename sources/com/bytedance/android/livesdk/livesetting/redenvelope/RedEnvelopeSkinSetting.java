package com.bytedance.android.livesdk.livesetting.redenvelope;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.LinkedHashMap;
import java.util.Map;

@SettingsKey("treasure_skin_configuration")
/* loaded from: classes6.dex */
public final class RedEnvelopeSkinSetting {
    public static final RedEnvelopeSkinSetting INSTANCE = new RedEnvelopeSkinSetting();

    @Group(isDefault = true, value = "default group")
    public static final Map<String, Map<String, String>> DEFAULT = new LinkedHashMap();

    public final Map<String, Map<String, String>> getValue() {
        return (Map) SettingsManager.INSTANCE.getValueSafely(RedEnvelopeSkinSetting.class);
    }

    public final Map<String, Map<String, String>> getDEFAULT() {
        return DEFAULT;
    }
}
