package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_image_monitor_scene")
/* loaded from: classes6.dex */
public final class LiveImageMonitorSceneSetting {
    public static final LiveImageMonitorSceneSetting INSTANCE = new LiveImageMonitorSceneSetting();

    @Group(isDefault = true, value = "default")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveImageMonitorSceneSetting.class);
    }
}
