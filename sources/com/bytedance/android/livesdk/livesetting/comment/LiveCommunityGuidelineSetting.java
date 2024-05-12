package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_community_guideline")
/* loaded from: classes6.dex */
public final class LiveCommunityGuidelineSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveCommunityGuidelineSetting INSTANCE = new LiveCommunityGuidelineSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveCommunityGuidelineSetting.class);
    }
}
