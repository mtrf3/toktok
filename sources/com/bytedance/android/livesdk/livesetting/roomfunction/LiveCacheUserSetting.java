package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("cache_user_before_enter_profile")
/* loaded from: classes6.dex */
public final class LiveCacheUserSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveCacheUserSetting INSTANCE = new LiveCacheUserSetting();

    public static final boolean get() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveCacheUserSetting.class);
    }
}
