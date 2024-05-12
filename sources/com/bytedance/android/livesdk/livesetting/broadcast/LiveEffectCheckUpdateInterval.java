package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_effect_cache_threshold")
/* loaded from: classes6.dex */
public final class LiveEffectCheckUpdateInterval {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveEffectCheckUpdateInterval INSTANCE = new LiveEffectCheckUpdateInterval();

    public final int getInterval() {
        return SettingsManager.INSTANCE.getIntValue(LiveEffectCheckUpdateInterval.class);
    }
}
