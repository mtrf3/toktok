package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_user_info_show_icon_for_long_language")
/* loaded from: classes6.dex */
public final class LiveUserInfoShowIconSetting {
    public static final LiveUserInfoShowIconSetting INSTANCE = new LiveUserInfoShowIconSetting();

    @Group(isDefault = true, value = "default")
    public static final String[] DEFAULT = {"ru-RU", "ja-JP", "my-MM", "uk-UA", "bn-IN"};

    public final String[] getLanguage() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveUserInfoShowIconSetting.class);
    }
}
