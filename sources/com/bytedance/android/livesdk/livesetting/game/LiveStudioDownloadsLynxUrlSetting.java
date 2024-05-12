package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_live_studio_downloads_page_scheme")
/* loaded from: classes6.dex */
public final class LiveStudioDownloadsLynxUrlSetting {

    @Group(isDefault = true, value = "default_group")
    public static final String DEFAULT = "";
    public static final LiveStudioDownloadsLynxUrlSetting INSTANCE = new LiveStudioDownloadsLynxUrlSetting();

    public final String getLynxUrl() {
        return SettingsManager.INSTANCE.getStringValue(LiveStudioDownloadsLynxUrlSetting.class);
    }
}
