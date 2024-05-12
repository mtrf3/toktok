package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_push_stream_log_level")
/* loaded from: classes6.dex */
public final class LivePushStreamLogLevelSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 5;
    public static final LivePushStreamLogLevelSetting INSTANCE = new LivePushStreamLogLevelSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePushStreamLogLevelSetting.class);
    }
}
