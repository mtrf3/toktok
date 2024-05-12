package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_landscape_inner_feed_setting")
/* loaded from: classes6.dex */
public final class LiveLandscapeInnerFeedSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveLandscapeInnerFeedSetting INSTANCE = new LiveLandscapeInnerFeedSetting();

    @Group("experiment_group")
    public static final boolean ENABLE = true;

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveLandscapeInnerFeedSetting.class) == ENABLE) {
            return true;
        }
        return false;
    }
}
