package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_pipo_monitor_host")
/* loaded from: classes6.dex */
public final class LivePipoMonitorHostSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "https://mon.tiktokv.com";
    public static final LivePipoMonitorHostSetting INSTANCE = new LivePipoMonitorHostSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LivePipoMonitorHostSetting.class);
    }
}
