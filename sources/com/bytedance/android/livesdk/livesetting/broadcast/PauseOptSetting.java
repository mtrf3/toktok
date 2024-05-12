package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = true, value = "opt_live_pause")
/* loaded from: classes6.dex */
public final class PauseOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final PauseOptSetting INSTANCE = new PauseOptSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(PauseOptSetting.class);
    }
}
