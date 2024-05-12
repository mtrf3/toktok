package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "mt_live_hybrid_reuse_config_android")
/* loaded from: classes6.dex */
public final class LiveHybridReuseConfigAndroidSetting {
    public static final LiveHybridReuseConfigAndroidSetting INSTANCE = new LiveHybridReuseConfigAndroidSetting();

    @Group(isDefault = true, value = "default group")
    public static final SparkReuseConfig[] DEFAULT = new SparkReuseConfig[0];

    public final SparkReuseConfig[] getValue() {
        return (SparkReuseConfig[]) SettingsManager.INSTANCE.getValueSafely(LiveHybridReuseConfigAndroidSetting.class);
    }
}
