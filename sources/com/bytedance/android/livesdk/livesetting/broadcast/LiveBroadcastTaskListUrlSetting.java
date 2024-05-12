package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_task_list_url")
/* loaded from: classes6.dex */
public final class LiveBroadcastTaskListUrlSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveBroadcastTaskListUrlSetting INSTANCE = new LiveBroadcastTaskListUrlSetting();

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveBroadcastTaskListUrlSetting.class);
    }
}
