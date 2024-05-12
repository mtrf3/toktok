package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_fix_nonstandard_bubbles_phase_two")
/* loaded from: classes6.dex */
public final class LiveFixNonstandardBubblesPhaseTwoSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveFixNonstandardBubblesPhaseTwoSetting INSTANCE = new LiveFixNonstandardBubblesPhaseTwoSetting();

    public final boolean isInExperiment() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFixNonstandardBubblesPhaseTwoSetting.class);
    }
}
