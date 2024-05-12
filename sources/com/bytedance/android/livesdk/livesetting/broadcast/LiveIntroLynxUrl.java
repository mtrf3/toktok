package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_intro_web_url")
/* loaded from: classes6.dex */
public final class LiveIntroLynxUrl {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveIntroLynxUrl INSTANCE = new LiveIntroLynxUrl();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveIntroLynxUrl.class);
    }
}
