package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_faster_release_msgs_low_heat_audience")
/* loaded from: classes6.dex */
public final class LiveFasterReleaseMsgsLowHeatAudienceSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveFasterReleaseMsgsLowHeatAudienceSetting INSTANCE = new LiveFasterReleaseMsgsLowHeatAudienceSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveFasterReleaseMsgsLowHeatAudienceSetting.class);
    }
}
