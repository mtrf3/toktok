package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_bottom_bar_entrance")
/* loaded from: classes6.dex */
public final class LiveGameBottomBarEntrance {
    public static final LiveGameBottomBarEntrance INSTANCE = new LiveGameBottomBarEntrance();

    @Group(isDefault = true, value = "default group")
    public static final String[] DEFAULT = new String[0];

    public final String[] getValue() {
        return SettingsManager.INSTANCE.getStringArrayValue(LiveGameBottomBarEntrance.class);
    }
}
