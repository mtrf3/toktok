package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_feed_add_cohost_match_components")
/* loaded from: classes11.dex */
public final class LiveCoHostAddFeedComponentsSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveCoHostAddFeedComponentsSetting INSTANCE = new LiveCoHostAddFeedComponentsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHostAddFeedComponentsSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
