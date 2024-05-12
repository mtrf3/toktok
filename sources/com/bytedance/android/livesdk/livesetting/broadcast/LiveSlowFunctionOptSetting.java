package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_slow_function_opt")
/* loaded from: classes6.dex */
public final class LiveSlowFunctionOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveSlowFunctionOptSetting INSTANCE = new LiveSlowFunctionOptSetting();

    public final boolean inSlowFunctionOptNew() {
        if (SettingsManager.INSTANCE.getIntValue(LiveSlowFunctionOptSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
