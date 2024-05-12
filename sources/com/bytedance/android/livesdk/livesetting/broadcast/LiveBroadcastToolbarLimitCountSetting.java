package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_toolbar_limit_count")
/* loaded from: classes6.dex */
public final class LiveBroadcastToolbarLimitCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 7;
    public static final LiveBroadcastToolbarLimitCountSetting INSTANCE = new LiveBroadcastToolbarLimitCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveBroadcastToolbarLimitCountSetting.class);
    }
}
