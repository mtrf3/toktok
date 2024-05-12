package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_go_live_bandwidth_test_enable")
/* loaded from: classes6.dex */
public final class LivePreviewNetworkSpeedSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivePreviewNetworkSpeedSetting INSTANCE = new LivePreviewNetworkSpeedSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LivePreviewNetworkSpeedSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
