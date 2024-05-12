package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_linkmic_dsl_load_optimize")
/* loaded from: classes11.dex */
public final class LiveLinkmicDslLoadOptimizeSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveLinkmicDslLoadOptimizeSetting INSTANCE = new LiveLinkmicDslLoadOptimizeSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveLinkmicDslLoadOptimizeSetting.class);
    }
}
