package com.bytedance.android.livesdk.livesetting.game;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_live_studio_download_page_url")
/* loaded from: classes6.dex */
public final class LiveStudioDownloadPageUrlSetting {

    @Group(isDefault = true, value = "default_group")
    public static final String DEFAULT = "";
    public static final LiveStudioDownloadPageUrlSetting INSTANCE = new LiveStudioDownloadPageUrlSetting();

    public final String getUrl() {
        return SettingsManager.INSTANCE.getStringValue(LiveStudioDownloadPageUrlSetting.class);
    }
}
