package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("landscape_live_long_press_optimize")
/* loaded from: classes6.dex */
public final class GameLiveEnableLongPress {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group(isDefault = false, value = "exp group")
    public static final boolean ENABLE_LOOP_PRESS = true;
    public static final GameLiveEnableLongPress INSTANCE = new GameLiveEnableLongPress();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getBooleanValue(GameLiveEnableLongPress.class)) {
            return true;
        }
        return false;
    }
}
