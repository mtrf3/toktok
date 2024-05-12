package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_privacy_page_url")
/* loaded from: classes6.dex */
public final class LiveAnchorPrivacyPageUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveAnchorPrivacyPageUrlSetting INSTANCE = new LiveAnchorPrivacyPageUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveAnchorPrivacyPageUrlSetting.class);
    }
}
