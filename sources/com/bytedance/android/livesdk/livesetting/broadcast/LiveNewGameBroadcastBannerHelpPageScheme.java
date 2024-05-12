package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_new_broadcast_new_help_page_scheme")
/* loaded from: classes6.dex */
public final class LiveNewGameBroadcastBannerHelpPageScheme {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveNewGameBroadcastBannerHelpPageScheme INSTANCE = new LiveNewGameBroadcastBannerHelpPageScheme();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveNewGameBroadcastBannerHelpPageScheme.class);
    }
}
