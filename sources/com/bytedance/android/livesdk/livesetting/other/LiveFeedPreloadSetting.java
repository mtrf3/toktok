package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.model.FeedPreloadConfig;

@SettingsKey("live_feed_preload")
/* loaded from: classes6.dex */
public final class LiveFeedPreloadSetting {
    public static final LiveFeedPreloadSetting INSTANCE = new LiveFeedPreloadSetting();

    @Group(isDefault = true, value = "default group")
    public static final FeedPreloadConfig DEFAULT = new FeedPreloadConfig();

    public final FeedPreloadConfig getValue() {
        FeedPreloadConfig feedPreloadConfig = (FeedPreloadConfig) SettingsManager.INSTANCE.getValueSafely(LiveFeedPreloadSetting.class);
        if (feedPreloadConfig == null) {
            return DEFAULT;
        }
        return feedPreloadConfig;
    }
}
