package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = true, value = "live_harmony_os_disable_pip")
/* loaded from: classes6.dex */
public final class LiveHarmonyOSDisablePipSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveHarmonyOSDisablePipSetting INSTANCE = new LiveHarmonyOSDisablePipSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveHarmonyOSDisablePipSetting.class);
    }
}
