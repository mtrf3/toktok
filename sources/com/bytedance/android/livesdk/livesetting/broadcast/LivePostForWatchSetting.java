package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_post_for_watch_switch")
/* loaded from: classes6.dex */
public final class LivePostForWatchSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivePostForWatchSetting INSTANCE = new LivePostForWatchSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getIntValue(LivePostForWatchSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
