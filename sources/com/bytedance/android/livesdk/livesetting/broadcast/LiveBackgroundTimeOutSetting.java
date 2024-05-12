package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_broadcast_background_time_out_enable")
/* loaded from: classes6.dex */
public final class LiveBackgroundTimeOutSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;

    @Group("disable group")
    public static final boolean DISABLE = false;

    @Group("enable group")
    public static final boolean ENABLE = true;
    public static final LiveBackgroundTimeOutSetting INSTANCE = new LiveBackgroundTimeOutSetting();

    public final boolean enable() {
        if (SettingsManager.INSTANCE.getBooleanValue(LiveBackgroundTimeOutSetting.class)) {
            return true;
        }
        return false;
    }
}
