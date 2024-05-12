package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("user_with_age")
/* loaded from: classes6.dex */
public final class UserWithAgeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final UserWithAgeSetting INSTANCE = new UserWithAgeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(UserWithAgeSetting.class);
    }
}
