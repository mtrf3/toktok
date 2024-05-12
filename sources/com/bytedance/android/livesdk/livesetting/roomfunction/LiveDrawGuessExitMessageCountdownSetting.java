package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;

@SettingsKey("live_draw_guess_lose_exit_message_countdown")
/* loaded from: classes6.dex */
public final class LiveDrawGuessExitMessageCountdownSetting {
    public static final LiveDrawGuessExitMessageCountdownSetting INSTANCE = new LiveDrawGuessExitMessageCountdownSetting();

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;

    public final long getCountdownTime() {
        return SettingsManager.INSTANCE.getLongValue(LiveDrawGuessExitMessageCountdownSetting.class);
    }
}
