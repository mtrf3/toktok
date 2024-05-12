package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_enable_preview_resume")
/* loaded from: classes6.dex */
public final class GameLivePreviewResumeSetting {

    @Group(isDefault = true, value = "default_group")
    public static final boolean DEFAULT = true;
    public static final GameLivePreviewResumeSetting INSTANCE = new GameLivePreviewResumeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(GameLivePreviewResumeSetting.class);
    }
}
