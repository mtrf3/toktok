package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_permission_check_method")
/* loaded from: classes6.dex */
public final class LivePermissionCheckMethodSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LivePermissionCheckMethodSetting INSTANCE = new LivePermissionCheckMethodSetting();

    public final boolean checkWithBuiltInMethod() {
        if (SettingsManager.INSTANCE.getIntValue(LivePermissionCheckMethodSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
