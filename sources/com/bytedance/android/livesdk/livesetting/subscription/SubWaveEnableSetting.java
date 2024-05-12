package com.bytedance.android.livesdk.livesetting.subscription;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("sub_wave_anchor_enable")
/* loaded from: classes6.dex */
public final class SubWaveEnableSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final SubWaveEnableSetting INSTANCE = new SubWaveEnableSetting();

    public final boolean isEnable() {
        if (SettingsManager.INSTANCE.getIntValue(SubWaveEnableSetting.class) != 0) {
            return true;
        }
        return false;
    }

    public final int getDEFAULT() {
        return DEFAULT;
    }
}
