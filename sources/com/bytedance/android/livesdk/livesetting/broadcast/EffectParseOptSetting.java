package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;

@SettingsKey("effect_parse_opt")
/* loaded from: classes6.dex */
public final class EffectParseOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final EffectParseOptSetting INSTANCE = new EffectParseOptSetting();
    public static int settingValue = LiveLayoutPreloadThreadPriority.DEFAULT;

    public static final boolean enableOpt() {
        if (settingValue == Integer.MIN_VALUE) {
            settingValue = SettingsManager.INSTANCE.getIntValue(EffectParseOptSetting.class);
        }
        int i = settingValue;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    public static final boolean enableOptAndCleanCache() {
        if (settingValue == Integer.MIN_VALUE) {
            settingValue = SettingsManager.INSTANCE.getIntValue(EffectParseOptSetting.class);
        }
        if (settingValue == 1) {
            return true;
        }
        return false;
    }
}
