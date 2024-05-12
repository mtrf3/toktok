package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("subscribe_entry_share_scheme")
/* loaded from: classes6.dex */
public final class LiveSubscribeEntryShareUrl {
    public static final LiveSubscribeEntryShareUrl INSTANCE = new LiveSubscribeEntryShareUrl();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveSubscribeEntryShareUrl.class);
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
