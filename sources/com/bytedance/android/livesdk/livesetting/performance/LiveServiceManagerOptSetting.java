package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_service_manager_opt")
/* loaded from: classes6.dex */
public final class LiveServiceManagerOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveServiceManagerOptSetting INSTANCE = new LiveServiceManagerOptSetting();
    public static int settingValue = LiveLayoutPreloadThreadPriority.DEFAULT;

    public static final boolean enable() {
        if (settingValue == Integer.MIN_VALUE) {
            settingValue = SettingsManager.INSTANCE.getIntValue(LiveServiceManagerOptSetting.class);
        }
        if (settingValue == 1) {
            return true;
        }
        return false;
    }
}
