package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_broadcast_audio_focus_service")
/* loaded from: classes6.dex */
public final class GameBroadcastAudioFocusSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final GameBroadcastAudioFocusSetting INSTANCE = new GameBroadcastAudioFocusSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(GameBroadcastAudioFocusSetting.class);
    }

    public final boolean isDisable() {
        return !isEnable();
    }
}
