package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_game_auto_cover_introduce_page")
/* loaded from: classes6.dex */
public final class LiveGameAutoCoverFAQPage {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveGameAutoCoverFAQPage INSTANCE = new LiveGameAutoCoverFAQPage();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveGameAutoCoverFAQPage.class);
    }
}
