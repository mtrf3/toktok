package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = true, value = "live_pause_push_fps")
/* loaded from: classes6.dex */
public final class PauseOptPushFpsSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 1;
    public static final PauseOptPushFpsSetting INSTANCE = new PauseOptPushFpsSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(PauseOptPushFpsSetting.class);
    }
}
