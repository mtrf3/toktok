package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_moderator_watcher_perception")
/* loaded from: classes6.dex */
public final class LiveModeratorWatcherPerceptionSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveModeratorWatcherPerceptionSetting INSTANCE = new LiveModeratorWatcherPerceptionSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveModeratorWatcherPerceptionSetting.class);
    }
}
