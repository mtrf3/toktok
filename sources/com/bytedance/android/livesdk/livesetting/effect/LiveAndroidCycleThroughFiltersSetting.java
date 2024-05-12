package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_android_cycle_through_filters")
/* loaded from: classes6.dex */
public final class LiveAndroidCycleThroughFiltersSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveAndroidCycleThroughFiltersSetting INSTANCE = new LiveAndroidCycleThroughFiltersSetting();

    public final boolean isEnabled() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAndroidCycleThroughFiltersSetting.class);
    }
}
