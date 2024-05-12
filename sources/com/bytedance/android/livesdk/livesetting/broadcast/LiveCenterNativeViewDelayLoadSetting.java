package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_center_native_view_delay_load_setting")
/* loaded from: classes6.dex */
public final class LiveCenterNativeViewDelayLoadSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10000;
    public static final LiveCenterNativeViewDelayLoadSetting INSTANCE = new LiveCenterNativeViewDelayLoadSetting();

    public final int delayTime() {
        return SettingsManager.INSTANCE.getIntValue(LiveCenterNativeViewDelayLoadSetting.class);
    }
}
