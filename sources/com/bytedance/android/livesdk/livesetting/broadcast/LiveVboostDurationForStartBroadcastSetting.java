package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_vboost_duration_for_start_broadcast")
/* loaded from: classes6.dex */
public final class LiveVboostDurationForStartBroadcastSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3000;
    public static final LiveVboostDurationForStartBroadcastSetting INSTANCE = new LiveVboostDurationForStartBroadcastSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveVboostDurationForStartBroadcastSetting.class);
    }
}
