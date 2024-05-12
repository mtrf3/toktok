package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_commercial_content_toggle_faq")
/* loaded from: classes6.dex */
public final class LiveCommercialContentToggleFaqUrl {
    public static final LiveCommercialContentToggleFaqUrl INSTANCE = new LiveCommercialContentToggleFaqUrl();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveCommercialContentToggleFaqUrl.class);
    }

    public final String getDEFAULT() {
        return DEFAULT;
    }
}
