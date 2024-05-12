package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_pb_dynamic_preload_config")
/* loaded from: classes6.dex */
public final class LivePBDynamicPreloadConfigSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LivePBDynamicPreloadConfigSetting INSTANCE = new LivePBDynamicPreloadConfigSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivePBDynamicPreloadConfigSetting.class);
    }
}
