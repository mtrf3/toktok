package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_hybrid_spark_switch_use_deny_mode")
/* loaded from: classes6.dex */
public final class LiveHybridSparkSwitchUseDenyModeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveHybridSparkSwitchUseDenyModeSetting INSTANCE = new LiveHybridSparkSwitchUseDenyModeSetting();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveHybridSparkSwitchUseDenyModeSetting.class);
    }
}
