package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_draw_guess_max_round_count")
/* loaded from: classes6.dex */
public final class LiveDrawGuessMaxRoundCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveDrawGuessMaxRoundCountSetting INSTANCE = new LiveDrawGuessMaxRoundCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveDrawGuessMaxRoundCountSetting.class);
    }
}
