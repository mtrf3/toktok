package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_game_link_mic_feed_setting")
/* loaded from: classes6.dex */
public final class GameLinkMicFeedSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("block group")
    public static final boolean GROUP_BLOCK = true;
    public static final GameLinkMicFeedSetting INSTANCE = new GameLinkMicFeedSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GameLinkMicFeedSetting.class);
    }

    public final boolean isDefault() {
        return !getValue();
    }
}
