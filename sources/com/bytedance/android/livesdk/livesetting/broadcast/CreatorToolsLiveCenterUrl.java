package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_anchor_center_lynx_url")
/* loaded from: classes6.dex */
public final class CreatorToolsLiveCenterUrl {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final CreatorToolsLiveCenterUrl INSTANCE = new CreatorToolsLiveCenterUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(CreatorToolsLiveCenterUrl.class);
    }
}
