package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_red_dot_offline_enable")
/* loaded from: classes6.dex */
public final class LiveRedDotOfflineEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveRedDotOfflineEnableSetting INSTANCE = new LiveRedDotOfflineEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveRedDotOfflineEnableSetting.class);
    }
}
