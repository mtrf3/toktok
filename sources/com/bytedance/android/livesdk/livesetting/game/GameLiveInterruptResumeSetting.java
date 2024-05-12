package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_broadcast_interrupt_error_resume")
/* loaded from: classes6.dex */
public final class GameLiveInterruptResumeSetting {

    @Group(isDefault = true, value = "default_group")
    public static final boolean DEFAULT = true;
    public static final GameLiveInterruptResumeSetting INSTANCE = new GameLiveInterruptResumeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GameLiveInterruptResumeSetting.class);
    }
}
