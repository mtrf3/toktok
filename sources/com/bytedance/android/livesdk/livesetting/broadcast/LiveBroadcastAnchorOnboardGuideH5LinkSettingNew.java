package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_onboard_guide_h5_new")
/* loaded from: classes6.dex */
public final class LiveBroadcastAnchorOnboardGuideH5LinkSettingNew {

    @Group(isDefault = true, value = "Default")
    public static final String DEFAULT = "";
    public static final LiveBroadcastAnchorOnboardGuideH5LinkSettingNew INSTANCE = new LiveBroadcastAnchorOnboardGuideH5LinkSettingNew();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveBroadcastAnchorOnboardGuideH5LinkSettingNew.class);
    }
}
