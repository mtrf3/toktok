package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("use_thread_in_widget_enable")
/* loaded from: classes6.dex */
public final class UserLevelThreadInWidgetSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final UserLevelThreadInWidgetSetting INSTANCE = new UserLevelThreadInWidgetSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserLevelThreadInWidgetSetting.class);
    }
}
