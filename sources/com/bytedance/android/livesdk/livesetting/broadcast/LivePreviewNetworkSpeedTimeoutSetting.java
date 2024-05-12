package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_go_live_bandwidth_test_timeout")
/* loaded from: classes6.dex */
public final class LivePreviewNetworkSpeedTimeoutSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 4300;
    public static final LivePreviewNetworkSpeedTimeoutSetting INSTANCE = new LivePreviewNetworkSpeedTimeoutSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LivePreviewNetworkSpeedTimeoutSetting.class);
    }
}
