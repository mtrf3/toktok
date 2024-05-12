package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("expose_monitor_switch")
/* loaded from: classes6.dex */
public final class ExposeMonitorSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final ExposeMonitorSwitchSetting INSTANCE = new ExposeMonitorSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(ExposeMonitorSwitchSetting.class);
    }
}
