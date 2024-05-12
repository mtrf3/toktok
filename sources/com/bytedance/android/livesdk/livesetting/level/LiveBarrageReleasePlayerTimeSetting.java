package com.bytedance.android.livesdk.livesetting.level;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_barrage_release_player_time")
/* loaded from: classes6.dex */
public final class LiveBarrageReleasePlayerTimeSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 40000;
    public static final LiveBarrageReleasePlayerTimeSetting INSTANCE = new LiveBarrageReleasePlayerTimeSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveBarrageReleasePlayerTimeSetting.class);
    }
}
