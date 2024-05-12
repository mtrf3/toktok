package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("feed_preload")
/* loaded from: classes6.dex */
public final class FeedPreloadSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 4;
    public static final FeedPreloadSetting INSTANCE = new FeedPreloadSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(FeedPreloadSetting.class);
    }
}
