package com.bytedance.android.livesdk.livesetting.watchlive.firstscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_preview_card_mpd_enable")
/* loaded from: classes6.dex */
public final class LivePreviewCardMPDSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LivePreviewCardMPDSetting INSTANCE = new LivePreviewCardMPDSetting();

    @Group("v1")
    public static final boolean enable = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePreviewCardMPDSetting.class);
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEnable() {
        return enable;
    }
}
