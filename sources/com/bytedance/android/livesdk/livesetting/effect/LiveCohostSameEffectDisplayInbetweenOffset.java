package com.bytedance.android.livesdk.livesetting.effect;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_co_host_same_effect_icon_time_offset")
/* loaded from: classes6.dex */
public final class LiveCohostSameEffectDisplayInbetweenOffset {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final LiveCohostSameEffectDisplayInbetweenOffset INSTANCE = new LiveCohostSameEffectDisplayInbetweenOffset();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveCohostSameEffectDisplayInbetweenOffset.class);
    }
}
