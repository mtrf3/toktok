package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_setting_util_anr_opt")
/* loaded from: classes6.dex */
public final class SettingUtilANROptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final SettingUtilANROptSetting INSTANCE = new SettingUtilANROptSetting();
    public static int settingValue = LiveLayoutPreloadThreadPriority.DEFAULT;

    public static final boolean enableOpt() {
        if (settingValue == Integer.MIN_VALUE) {
            settingValue = SettingsManager.INSTANCE.getIntValue(SettingUtilANROptSetting.class);
        }
        if (settingValue == 1) {
            return true;
        }
        return false;
    }
}
