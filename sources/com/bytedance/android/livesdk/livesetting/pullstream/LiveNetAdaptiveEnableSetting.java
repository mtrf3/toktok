package com.bytedance.android.livesdk.livesetting.pullstream;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_net_adaptive_enable")
/* loaded from: classes6.dex */
public final class LiveNetAdaptiveEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveNetAdaptiveEnableSetting INSTANCE = new LiveNetAdaptiveEnableSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveNetAdaptiveEnableSetting.class);
    }
}
