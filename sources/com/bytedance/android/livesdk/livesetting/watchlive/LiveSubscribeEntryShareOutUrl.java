package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("subscribe_entry_share_h5_url")
/* loaded from: classes6.dex */
public final class LiveSubscribeEntryShareOutUrl {
    public static final LiveSubscribeEntryShareOutUrl INSTANCE = new LiveSubscribeEntryShareOutUrl();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveSubscribeEntryShareOutUrl.class);
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
