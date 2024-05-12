package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_network_monitor_duration")
/* loaded from: classes6.dex */
public final class LiveAnchorNetworkMonitorDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 20;
    public static final LiveAnchorNetworkMonitorDurationSetting INSTANCE = new LiveAnchorNetworkMonitorDurationSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveAnchorNetworkMonitorDurationSetting.class);
    }
}
