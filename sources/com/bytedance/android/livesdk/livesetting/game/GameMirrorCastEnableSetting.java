package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("game_mirror_cast_enable")
/* loaded from: classes6.dex */
public final class GameMirrorCastEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final GameMirrorCastEnableSetting INSTANCE = new GameMirrorCastEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GameMirrorCastEnableSetting.class);
    }
}
