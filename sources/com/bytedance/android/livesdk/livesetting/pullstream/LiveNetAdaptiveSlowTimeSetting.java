package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_net_adaptive_slow_time")
/* loaded from: classes6.dex */
public final class LiveNetAdaptiveSlowTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveNetAdaptiveSlowTimeSetting INSTANCE = new LiveNetAdaptiveSlowTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveNetAdaptiveSlowTimeSetting.class);
    }
}
