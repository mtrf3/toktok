package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_task_resource_id")
/* loaded from: classes6.dex */
public final class LiveBroadcastTaskResourceIdSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 43;
    public static final LiveBroadcastTaskResourceIdSetting INSTANCE = new LiveBroadcastTaskResourceIdSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveBroadcastTaskResourceIdSetting.class);
    }
}
