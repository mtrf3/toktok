package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_go_live_bandwidth_test_countdown")
/* loaded from: classes6.dex */
public final class BroadcastSpeedTestCountdownTimerSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final BroadcastSpeedTestCountdownTimerSetting INSTANCE = new BroadcastSpeedTestCountdownTimerSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(BroadcastSpeedTestCountdownTimerSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
