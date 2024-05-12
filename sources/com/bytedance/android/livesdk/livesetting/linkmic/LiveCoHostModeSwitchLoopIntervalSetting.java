package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_modeswitch_loop_interval_setting")
/* loaded from: classes6.dex */
public final class LiveCoHostModeSwitchLoopIntervalSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 100;
    public static final LiveCoHostModeSwitchLoopIntervalSetting INSTANCE = new LiveCoHostModeSwitchLoopIntervalSetting();

    public static final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveCoHostModeSwitchLoopIntervalSetting.class);
    }
}
