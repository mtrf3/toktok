package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_co_host_same_effect_panel_count")
/* loaded from: classes6.dex */
public final class LiveCohostSameEffectDisplayMaxCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 12;
    public static final LiveCohostSameEffectDisplayMaxCountSetting INSTANCE = new LiveCohostSameEffectDisplayMaxCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostSameEffectDisplayMaxCountSetting.class);
    }
}
