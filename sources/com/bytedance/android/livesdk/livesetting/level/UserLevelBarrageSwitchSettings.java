package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("barrage_show_with_gecko_exist")
/* loaded from: classes6.dex */
public final class UserLevelBarrageSwitchSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final UserLevelBarrageSwitchSettings INSTANCE = new UserLevelBarrageSwitchSettings();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserLevelBarrageSwitchSettings.class);
    }
}
