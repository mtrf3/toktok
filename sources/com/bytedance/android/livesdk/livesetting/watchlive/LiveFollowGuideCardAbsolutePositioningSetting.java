package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_follow_guide_card_absolute_positioning")
/* loaded from: classes6.dex */
public final class LiveFollowGuideCardAbsolutePositioningSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveFollowGuideCardAbsolutePositioningSetting INSTANCE = new LiveFollowGuideCardAbsolutePositioningSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFollowGuideCardAbsolutePositioningSetting.class);
    }
}
