package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_user_watch_duration_layer")
/* loaded from: classes6.dex */
public final class LiveUserWatchDurationLayoutSettings {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveUserWatchDurationLayoutSettings INSTANCE = new LiveUserWatchDurationLayoutSettings();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveUserWatchDurationLayoutSettings.class);
    }
}
