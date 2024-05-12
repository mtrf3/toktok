package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_so_monitor_filter")
/* loaded from: classes11.dex */
public final class LiveSoMonitorFilterSetting {
    public static final LiveSoMonitorFilterSetting INSTANCE = new LiveSoMonitorFilterSetting();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = {"byterts", "ttmcmaf", "ttquic", "volcenginertc"};

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveSoMonitorFilterSetting.class);
    }
}
