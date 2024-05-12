package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("fans_club_read_config_fail_monitor_setting")
/* loaded from: classes6.dex */
public final class FansClubReadConfigFailMonitorSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final FansClubReadConfigFailMonitorSetting INSTANCE = new FansClubReadConfigFailMonitorSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(FansClubReadConfigFailMonitorSetting.class);
    }
}
