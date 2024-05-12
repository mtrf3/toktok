package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_broadcast_log_monitor_enable")
/* loaded from: classes6.dex */
public final class GameBroadcastLogMonitorEnable {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final GameBroadcastLogMonitorEnable INSTANCE = new GameBroadcastLogMonitorEnable();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(GameBroadcastLogMonitorEnable.class);
    }

    public final boolean isDisable() {
        return !isEnable();
    }
}
