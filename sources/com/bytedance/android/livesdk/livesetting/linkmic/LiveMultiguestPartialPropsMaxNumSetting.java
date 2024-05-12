package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_multiguest_partial_props_max_num")
/* loaded from: classes6.dex */
public final class LiveMultiguestPartialPropsMaxNumSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 10;
    public static final LiveMultiguestPartialPropsMaxNumSetting INSTANCE = new LiveMultiguestPartialPropsMaxNumSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMultiguestPartialPropsMaxNumSetting.class);
    }
}
