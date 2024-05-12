package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_center_lynx_url")
/* loaded from: classes6.dex */
public final class BroadcastLiveCenterUrl {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final BroadcastLiveCenterUrl INSTANCE = new BroadcastLiveCenterUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(BroadcastLiveCenterUrl.class);
    }
}
