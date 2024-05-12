package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_age_threshold")
/* loaded from: classes6.dex */
public final class LiveBroadcastAgeThresholdSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 18;
    public static final LiveBroadcastAgeThresholdSetting INSTANCE = new LiveBroadcastAgeThresholdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveBroadcastAgeThresholdSetting.class);
    }
}
