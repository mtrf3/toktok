package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = true, value = "opt_live_pause_disable_effect")
/* loaded from: classes6.dex */
public final class PauseOptDisableEffectSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final PauseOptDisableEffectSetting INSTANCE = new PauseOptDisableEffectSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(PauseOptDisableEffectSetting.class);
    }
}
