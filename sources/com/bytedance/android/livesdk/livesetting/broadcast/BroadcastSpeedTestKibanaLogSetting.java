package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_go_live_bandwidth_test_kibana_log")
/* loaded from: classes6.dex */
public final class BroadcastSpeedTestKibanaLogSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final BroadcastSpeedTestKibanaLogSetting INSTANCE = new BroadcastSpeedTestKibanaLogSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(BroadcastSpeedTestKibanaLogSetting.class) == 0) {
            return true;
        }
        return false;
    }
}
