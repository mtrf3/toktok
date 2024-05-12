package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_user_preview_show_at")
/* loaded from: classes6.dex */
public final class LiveProfileAtSetting {

    @Group(isDefault = true, value = "default")
    public static final int DEFAULT = 0;
    public static final LiveProfileAtSetting INSTANCE = new LiveProfileAtSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveProfileAtSetting.class) != DEFAULT) {
            return true;
        }
        return false;
    }
}
