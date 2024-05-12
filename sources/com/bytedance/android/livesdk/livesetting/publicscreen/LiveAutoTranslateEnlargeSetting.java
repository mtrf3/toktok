package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_auto_translate_enlarge_setting")
/* loaded from: classes6.dex */
public final class LiveAutoTranslateEnlargeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveAutoTranslateEnlargeSetting INSTANCE = new LiveAutoTranslateEnlargeSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAutoTranslateEnlargeSetting.class);
    }
}
