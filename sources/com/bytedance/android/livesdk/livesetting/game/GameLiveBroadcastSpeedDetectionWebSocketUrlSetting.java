package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_broadcast_speed_test_websocket_url")
/* loaded from: classes6.dex */
public final class GameLiveBroadcastSpeedDetectionWebSocketUrlSetting {

    @Group(isDefault = true, value = "default_group")
    public static final String DEFAULT = "";
    public static final GameLiveBroadcastSpeedDetectionWebSocketUrlSetting INSTANCE = new GameLiveBroadcastSpeedDetectionWebSocketUrlSetting();

    public final String getSpeedDetectionWebSocketUrl() {
        return SettingsManager.INSTANCE.getStringValue(GameLiveBroadcastSpeedDetectionWebSocketUrlSetting.class);
    }
}
