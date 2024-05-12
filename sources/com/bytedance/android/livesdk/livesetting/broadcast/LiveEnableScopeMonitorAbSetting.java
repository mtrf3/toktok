package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_scope_monitor_ab")
/* loaded from: classes6.dex */
public final class LiveEnableScopeMonitorAbSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final LiveEnableScopeMonitorAbSetting INSTANCE = new LiveEnableScopeMonitorAbSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEnableScopeMonitorAbSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
