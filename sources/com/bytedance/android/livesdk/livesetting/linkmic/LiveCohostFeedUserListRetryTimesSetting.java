package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_feed_user_list_retry_times")
/* loaded from: classes6.dex */
public final class LiveCohostFeedUserListRetryTimesSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final LiveCohostFeedUserListRetryTimesSetting INSTANCE = new LiveCohostFeedUserListRetryTimesSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostFeedUserListRetryTimesSetting.class);
    }
}
