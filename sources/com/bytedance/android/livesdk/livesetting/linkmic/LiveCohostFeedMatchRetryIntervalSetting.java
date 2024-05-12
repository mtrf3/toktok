package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_feed_match_retry_interval")
/* loaded from: classes6.dex */
public final class LiveCohostFeedMatchRetryIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1000;
    public static final LiveCohostFeedMatchRetryIntervalSetting INSTANCE = new LiveCohostFeedMatchRetryIntervalSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostFeedMatchRetryIntervalSetting.class);
    }
}
