package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("game_watch_display_opt")
/* loaded from: classes6.dex */
public final class GameWatchLiveDisplayOptExp {

    @Group(isDefault = true, value = "default_v3")
    public static final int DEFAULT = 3;

    @Group("display_v1")
    public static final int DISPLAY_V1 = 1;

    @Group("display_v2")
    public static final int DISPLAY_V2 = 2;
    public static final GameWatchLiveDisplayOptExp INSTANCE = new GameWatchLiveDisplayOptExp();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(GameWatchLiveDisplayOptExp.class);
    }
}
