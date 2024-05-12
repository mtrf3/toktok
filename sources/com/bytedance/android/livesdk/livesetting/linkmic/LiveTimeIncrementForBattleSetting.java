package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_time_increment_for_battle")
/* loaded from: classes14.dex */
public final class LiveTimeIncrementForBattleSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 2;
    public static final LiveTimeIncrementForBattleSetting INSTANCE = new LiveTimeIncrementForBattleSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveTimeIncrementForBattleSetting.class);
    }
}
