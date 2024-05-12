package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "new_anchor_guidance_interaction_delay")
/* loaded from: classes6.dex */
public final class NewAnchorGuidanceInteractionDelaySetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10000;
    public static final NewAnchorGuidanceInteractionDelaySetting INSTANCE = new NewAnchorGuidanceInteractionDelaySetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(NewAnchorGuidanceInteractionDelaySetting.class);
    }
}
