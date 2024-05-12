package com.bytedance.android.livesdk.comp.impl.game.linkmic.settings;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_link_mic_switch")
/* loaded from: classes6.dex */
public final class GameLinkMicSetting {

    @Group(isDefault = true, value = "default_group")
    public static final int DEFAULT = 1;

    @Group("experiment_group")
    public static final int DISABLE = 0;
    public static final GameLinkMicSetting INSTANCE = new GameLinkMicSetting();

    public static final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(GameLinkMicSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
