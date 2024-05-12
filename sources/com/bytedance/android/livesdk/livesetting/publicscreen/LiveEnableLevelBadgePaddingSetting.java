package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_enable_level_badge_padding")
/* loaded from: classes6.dex */
public final class LiveEnableLevelBadgePaddingSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveEnableLevelBadgePaddingSetting INSTANCE = new LiveEnableLevelBadgePaddingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableLevelBadgePaddingSetting.class);
    }
}
