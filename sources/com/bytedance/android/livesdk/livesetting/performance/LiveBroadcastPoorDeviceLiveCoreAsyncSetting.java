package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_poor_device_live_core_async_setting")
/* loaded from: classes6.dex */
public final class LiveBroadcastPoorDeviceLiveCoreAsyncSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveBroadcastPoorDeviceLiveCoreAsyncSetting INSTANCE = new LiveBroadcastPoorDeviceLiveCoreAsyncSetting();

    public final boolean enableAny() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBroadcastPoorDeviceLiveCoreAsyncSetting.class) != 0) {
            return true;
        }
        return false;
    }

    public final boolean preloadAtBroadcast() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBroadcastPoorDeviceLiveCoreAsyncSetting.class) == 2) {
            return true;
        }
        return false;
    }

    public final boolean preloadAtPreview() {
        if (SettingsManager.INSTANCE.getIntValue(LiveBroadcastPoorDeviceLiveCoreAsyncSetting.class) == 1) {
            return true;
        }
        return false;
    }
}
