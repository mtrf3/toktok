package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_live_broadcast_release_video_gift")
/* loaded from: classes6.dex */
public final class GameLiveBroadcastReleaseVideoGift {

    @Group(isDefault = true, value = "default_group")
    public static final boolean DEFAULT = false;
    public static final GameLiveBroadcastReleaseVideoGift INSTANCE = new GameLiveBroadcastReleaseVideoGift();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GameLiveBroadcastReleaseVideoGift.class);
    }
}
