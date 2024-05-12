package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_onboard_guide_h5")
/* loaded from: classes6.dex */
public final class LiveBroadcaseAnchorOnboardGuideH5LinkSetting {

    @Group(isDefault = true, value = "Default")
    public static final String DEFAULT = "https://inapp.tiktokv.com/falcon/webcast_mt/page/safety_text_education/index.html";
    public static final LiveBroadcaseAnchorOnboardGuideH5LinkSetting INSTANCE = new LiveBroadcaseAnchorOnboardGuideH5LinkSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveBroadcaseAnchorOnboardGuideH5LinkSetting.class);
    }
}
