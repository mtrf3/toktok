package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_preload_gpu_turbor_setting")
/* loaded from: classes6.dex */
public final class LivePreloadGpuTurborSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LivePreloadGpuTurborSetting INSTANCE = new LivePreloadGpuTurborSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePreloadGpuTurborSetting.class);
    }
}
