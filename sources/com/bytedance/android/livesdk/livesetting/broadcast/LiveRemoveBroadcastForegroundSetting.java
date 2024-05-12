package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_remove_broadcast_foreground_enable")
/* loaded from: classes6.dex */
public final class LiveRemoveBroadcastForegroundSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("disable group")
    public static final boolean DISABLE = false;

    @Group("enable group")
    public static final boolean ENABLE = true;
    public static final LiveRemoveBroadcastForegroundSetting INSTANCE = new LiveRemoveBroadcastForegroundSetting();

    public final boolean disable() {
        return !SettingsManager.INSTANCE.getBooleanValue(LiveRemoveBroadcastForegroundSetting.class);
    }
}
