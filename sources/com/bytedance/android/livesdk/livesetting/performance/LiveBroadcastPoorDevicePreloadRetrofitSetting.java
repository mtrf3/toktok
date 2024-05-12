package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_poor_device_preload_retrofit_setting")
/* loaded from: classes6.dex */
public final class LiveBroadcastPoorDevicePreloadRetrofitSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveBroadcastPoorDevicePreloadRetrofitSetting INSTANCE = new LiveBroadcastPoorDevicePreloadRetrofitSetting();

    public final boolean enable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveBroadcastPoorDevicePreloadRetrofitSetting.class);
    }
}
