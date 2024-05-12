package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_modeswitch_loop_count_setting")
/* loaded from: classes6.dex */
public final class LiveCoHostModeSwitchLoopCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10;
    public static final LiveCoHostModeSwitchLoopCountSetting INSTANCE = new LiveCoHostModeSwitchLoopCountSetting();

    public static final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCoHostModeSwitchLoopCountSetting.class);
    }
}
