package com.bytedance.android.livesdk.livesetting.feed;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("ttlive_broadcast_game_related_live_validity_period")
/* loaded from: classes6.dex */
public final class LiveGameRelatedPeriodSetting {
    public static final LiveGameRelatedPeriodSetting INSTANCE = new LiveGameRelatedPeriodSetting();

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 120000;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveGameRelatedPeriodSetting.class);
    }
}
