package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_optimized_like")
/* loaded from: classes6.dex */
public final class LiveOptimizedLikeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveOptimizedLikeSetting INSTANCE = new LiveOptimizedLikeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveOptimizedLikeSetting.class);
    }
}
