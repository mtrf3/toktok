package com.bytedance.android.livesdk.impl.revenue.subscription.ui.spotlight;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("subscription_spotlight_loop_query_interval")
/* loaded from: classes6.dex */
public final class SpotlightLoopInterval {
    public static final int $stable = 0;

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 5;
    public static final SpotlightLoopInterval INSTANCE = new SpotlightLoopInterval();

    public final int getLoopInterval() {
        int intValue = SettingsManager.INSTANCE.getIntValue(SpotlightLoopInterval.class);
        if (intValue == 0) {
            return 5;
        }
        return intValue;
    }
}
