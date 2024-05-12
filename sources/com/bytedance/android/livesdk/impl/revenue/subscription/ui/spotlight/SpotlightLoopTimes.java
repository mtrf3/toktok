package com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("subscription_spotlight_loop_query_times")
/* loaded from: classes6.dex */
public final class SpotlightLoopTimes {
    public static final int $stable = 0;

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 4;
    public static final SpotlightLoopTimes INSTANCE = new SpotlightLoopTimes();

    public final int getLoopTimes() {
        int intValue = SettingsManager.INSTANCE.getIntValue(SpotlightLoopTimes.class);
        if (intValue == 0) {
            return 4;
        }
        return intValue;
    }
}
