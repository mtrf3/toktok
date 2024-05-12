package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_play_ad_not_refresh_layout")
/* loaded from: classes6.dex */
public final class LinkMicPlayingAdNotRefreshLayoutSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicPlayingAdNotRefreshLayoutSetting INSTANCE = new LinkMicPlayingAdNotRefreshLayoutSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicPlayingAdNotRefreshLayoutSetting.class);
    }
}
