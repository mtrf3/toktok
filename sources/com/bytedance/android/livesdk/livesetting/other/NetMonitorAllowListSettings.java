package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("net_monitor_allow_list")
/* loaded from: classes6.dex */
public final class NetMonitorAllowListSettings {
    public static final NetMonitorAllowListSettings INSTANCE = new NetMonitorAllowListSettings();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(NetMonitorAllowListSettings.class);
    }
}
