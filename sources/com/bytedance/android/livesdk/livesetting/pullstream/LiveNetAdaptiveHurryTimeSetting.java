package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_net_adaptive_hurry_time")
/* loaded from: classes6.dex */
public final class LiveNetAdaptiveHurryTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 2000;
    public static final LiveNetAdaptiveHurryTimeSetting INSTANCE = new LiveNetAdaptiveHurryTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveNetAdaptiveHurryTimeSetting.class);
    }
}
