package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("opt_live_pause_delay_duration")
/* loaded from: classes6.dex */
public final class PauseOptDelayDurationSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 2000;
    public static final PauseOptDelayDurationSetting INSTANCE = new PauseOptDelayDurationSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(PauseOptDelayDurationSetting.class);
    }
}
