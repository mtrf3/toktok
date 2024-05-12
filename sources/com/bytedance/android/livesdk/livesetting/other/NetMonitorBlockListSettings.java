package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("net_monitor_block_list")
/* loaded from: classes6.dex */
public final class NetMonitorBlockListSettings {
    public static final NetMonitorBlockListSettings INSTANCE = new NetMonitorBlockListSettings();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(NetMonitorBlockListSettings.class);
    }
}
