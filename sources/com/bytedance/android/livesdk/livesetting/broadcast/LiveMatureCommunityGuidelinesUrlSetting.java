package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_community_guidelines_url")
/* loaded from: classes6.dex */
public final class LiveMatureCommunityGuidelinesUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveMatureCommunityGuidelinesUrlSetting INSTANCE = new LiveMatureCommunityGuidelinesUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveMatureCommunityGuidelinesUrlSetting.class);
    }
}
