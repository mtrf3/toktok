package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_hybrid_container_force_use_spark")
/* loaded from: classes6.dex */
public final class LiveHybridContainerForceUseSparkSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveHybridContainerForceUseSparkSetting INSTANCE = new LiveHybridContainerForceUseSparkSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveHybridContainerForceUseSparkSetting.class);
    }
}
