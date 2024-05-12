package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = true, value = "live_clear_screen_back_opt")
/* loaded from: classes6.dex */
public final class LiveClearScreenBackOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveClearScreenBackOptSetting INSTANCE = new LiveClearScreenBackOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveClearScreenBackOptSetting.class);
    }
}
