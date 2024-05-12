package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_feed_remove_opt")
/* loaded from: classes6.dex */
public final class LiveCoHostFeedRemoveOptSetting {
    public static final LiveCoHostFeedRemoveOptSetting INSTANCE = new LiveCoHostFeedRemoveOptSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHostFeedRemoveOptSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
