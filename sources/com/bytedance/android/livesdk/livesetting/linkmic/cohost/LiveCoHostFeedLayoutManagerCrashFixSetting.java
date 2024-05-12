package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_feed_layoutmanager_crash_fix")
/* loaded from: classes6.dex */
public final class LiveCoHostFeedLayoutManagerCrashFixSetting {
    public static final LiveCoHostFeedLayoutManagerCrashFixSetting INSTANCE = new LiveCoHostFeedLayoutManagerCrashFixSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHostFeedLayoutManagerCrashFixSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
