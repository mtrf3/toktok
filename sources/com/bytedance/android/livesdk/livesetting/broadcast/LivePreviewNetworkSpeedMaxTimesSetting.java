package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_go_live_bandwidth_test_max_times")
/* loaded from: classes6.dex */
public final class LivePreviewNetworkSpeedMaxTimesSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 5;
    public static final LivePreviewNetworkSpeedMaxTimesSetting INSTANCE = new LivePreviewNetworkSpeedMaxTimesSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePreviewNetworkSpeedMaxTimesSetting.class);
    }
}
