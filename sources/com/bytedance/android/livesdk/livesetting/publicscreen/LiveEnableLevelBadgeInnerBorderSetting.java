package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_enable_level_badge_inner_border")
/* loaded from: classes6.dex */
public final class LiveEnableLevelBadgeInnerBorderSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveEnableLevelBadgeInnerBorderSetting INSTANCE = new LiveEnableLevelBadgeInnerBorderSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveEnableLevelBadgeInnerBorderSetting.class);
    }
}
