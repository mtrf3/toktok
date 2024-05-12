package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_match_armies_looper_enabled")
/* loaded from: classes14.dex */
public final class LiveMatchArmiesLooperSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMatchArmiesLooperSettings INSTANCE = new LiveMatchArmiesLooperSettings();

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveMatchArmiesLooperSettings.class)) {
            return true;
        }
        return false;
    }
}
