package com.bytedance.android.livesdk.livesetting.hybrid;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("mt_live_optimize_hybrid_fetch_return")
/* loaded from: classes6.dex */
public final class OptimizeHybridFetchReturnSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final OptimizeHybridFetchReturnSetting INSTANCE = new OptimizeHybridFetchReturnSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(OptimizeHybridFetchReturnSetting.class);
    }
}
