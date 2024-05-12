package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_feed_refresh_time")
/* loaded from: classes6.dex */
public final class LiveFeedRefreshTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 180;
    public static final LiveFeedRefreshTimeSetting INSTANCE = new LiveFeedRefreshTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveFeedRefreshTimeSetting.class);
    }
}
