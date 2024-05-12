package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_draw_guess_request_summary_delay")
/* loaded from: classes6.dex */
public final class LiveDrawGuessRequestSummaryDelaySetting {
    public static final LiveDrawGuessRequestSummaryDelaySetting INSTANCE = new LiveDrawGuessRequestSummaryDelaySetting();

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 3000;

    public final long getDelayTime() {
        return SettingsManager.INSTANCE.getLongValue(LiveDrawGuessRequestSummaryDelaySetting.class);
    }
}
