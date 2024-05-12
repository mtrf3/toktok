package com.bytedance.android.livesdk.broadcast.setting;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_broadcast_preload_cover")
/* loaded from: classes6.dex */
public final class BroadcastGamePreloadCover {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("experiment_group")
    public static final boolean ENABLE = true;
    public static final BroadcastGamePreloadCover INSTANCE = new BroadcastGamePreloadCover();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(BroadcastGamePreloadCover.class)) {
            return true;
        }
        return false;
    }
}
