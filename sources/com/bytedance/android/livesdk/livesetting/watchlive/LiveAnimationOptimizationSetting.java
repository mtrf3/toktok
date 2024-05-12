package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_animation_optimization")
/* loaded from: classes6.dex */
public final class LiveAnimationOptimizationSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveAnimationOptimizationSetting INSTANCE = new LiveAnimationOptimizationSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveAnimationOptimizationSetting.class);
    }
}
