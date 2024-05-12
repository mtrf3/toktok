package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_guide_to_ls_scheme")
/* loaded from: classes6.dex */
public final class LiveStudioGuideLynxUrlSetting {

    @Group(isDefault = true, value = "default_group")
    public static final String DEFAULT = "";
    public static final LiveStudioGuideLynxUrlSetting INSTANCE = new LiveStudioGuideLynxUrlSetting();

    public final String getLynxUrl() {
        return SettingsManager.INSTANCE.getStringValue(LiveStudioGuideLynxUrlSetting.class);
    }
}
