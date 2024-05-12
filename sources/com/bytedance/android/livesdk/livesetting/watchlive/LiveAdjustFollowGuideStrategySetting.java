package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_adjust_follow_guide_strategy")
/* loaded from: classes6.dex */
public final class LiveAdjustFollowGuideStrategySetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveAdjustFollowGuideStrategySetting INSTANCE = new LiveAdjustFollowGuideStrategySetting();

    @Group("v2")
    public static final boolean V2 = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAdjustFollowGuideStrategySetting.class);
    }
}
