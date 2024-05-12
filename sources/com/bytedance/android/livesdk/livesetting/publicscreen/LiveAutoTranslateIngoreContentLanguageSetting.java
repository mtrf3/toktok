package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_auto_translate_ingore_content_language_setting")
/* loaded from: classes6.dex */
public final class LiveAutoTranslateIngoreContentLanguageSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveAutoTranslateIngoreContentLanguageSetting INSTANCE = new LiveAutoTranslateIngoreContentLanguageSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAutoTranslateIngoreContentLanguageSetting.class);
    }
}
