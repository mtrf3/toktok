package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_enable_pre_created_player")
/* loaded from: classes11.dex */
public final class LiveEnablePreCreatedPlayer {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("v1")
    public static final int ENABLE = 1;
    public static final LiveEnablePreCreatedPlayer INSTANCE = new LiveEnablePreCreatedPlayer();

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getIntValue(LiveEnablePreCreatedPlayer.class) == 1) {
            return true;
        }
        return false;
    }
}
