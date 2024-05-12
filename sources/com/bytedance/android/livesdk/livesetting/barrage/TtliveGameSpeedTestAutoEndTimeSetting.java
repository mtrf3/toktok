package com.bytedance.android.livesdk.livesetting.barrage;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "ttlive_game_speed_test_auto_end_time")
/* loaded from: classes6.dex */
public final class TtliveGameSpeedTestAutoEndTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 20;
    public static final TtliveGameSpeedTestAutoEndTimeSetting INSTANCE = new TtliveGameSpeedTestAutoEndTimeSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(TtliveGameSpeedTestAutoEndTimeSetting.class);
    }
}
