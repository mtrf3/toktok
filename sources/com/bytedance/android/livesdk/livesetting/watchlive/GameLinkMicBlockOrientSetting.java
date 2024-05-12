package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_game_link_mic_block_orient_setting")
/* loaded from: classes6.dex */
public final class GameLinkMicBlockOrientSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("block group")
    public static final boolean GROUP_BLOCK = true;
    public static final GameLinkMicBlockOrientSetting INSTANCE = new GameLinkMicBlockOrientSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GameLinkMicBlockOrientSetting.class);
    }

    public final boolean isDefault() {
        return !getValue();
    }
}
