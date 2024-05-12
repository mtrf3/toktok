package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_go_live_bandwidth_test_bad_bitrate")
/* loaded from: classes6.dex */
public final class LivePreviewNetworkSpeedThresholdSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 300000;
    public static final LivePreviewNetworkSpeedThresholdSetting INSTANCE = new LivePreviewNetworkSpeedThresholdSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LivePreviewNetworkSpeedThresholdSetting.class);
    }
}
