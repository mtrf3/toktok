package com.bytedance.android.livesdk.livesetting.performance;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_rv_pool_fluency_support_sample")
/* loaded from: classes6.dex */
public final class LiveRvPoolFluencySupportSampleSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveRvPoolFluencySupportSampleSetting INSTANCE = new LiveRvPoolFluencySupportSampleSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveRvPoolFluencySupportSampleSetting.class);
    }
}
