package com.bytedance.android.livesdk.livesetting.banner;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_goals_widget_lynx_load_delay_time")
/* loaded from: classes6.dex */
public final class LiveGoalsWidgetLynxLoadDelayTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 0;
    public static final LiveGoalsWidgetLynxLoadDelayTimeSetting INSTANCE = new LiveGoalsWidgetLynxLoadDelayTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveGoalsWidgetLynxLoadDelayTimeSetting.class);
    }
}
