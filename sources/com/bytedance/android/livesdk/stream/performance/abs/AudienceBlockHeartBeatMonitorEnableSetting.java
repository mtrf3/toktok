package com.bytedance.android.livesdk.stream.performance.abs;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_stream_performance_auheartbeatmonitor_enable")
/* loaded from: classes6.dex */
public final class AudienceBlockHeartBeatMonitorEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("v1")
    public static final boolean ENABLE = true;
    public static final AudienceBlockHeartBeatMonitorEnableSetting INSTANCE = new AudienceBlockHeartBeatMonitorEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(AudienceBlockHeartBeatMonitorEnableSetting.class);
    }
}
