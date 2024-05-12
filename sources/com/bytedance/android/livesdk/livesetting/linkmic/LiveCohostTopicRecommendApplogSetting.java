package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_topic_recommend_applog")
/* loaded from: classes6.dex */
public final class LiveCohostTopicRecommendApplogSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCohostTopicRecommendApplogSetting INSTANCE = new LiveCohostTopicRecommendApplogSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostTopicRecommendApplogSetting.class);
    }
}
