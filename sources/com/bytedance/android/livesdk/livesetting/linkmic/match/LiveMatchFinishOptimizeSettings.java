package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enale_battle_result_settle_optimization")
/* loaded from: classes14.dex */
public final class LiveMatchFinishOptimizeSettings {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveMatchFinishOptimizeSettings INSTANCE = new LiveMatchFinishOptimizeSettings();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveMatchFinishOptimizeSettings.class);
    }
}
