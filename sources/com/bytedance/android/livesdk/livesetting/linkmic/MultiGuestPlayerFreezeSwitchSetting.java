package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "ttlive_multi_guest_player_freeze_switch")
/* loaded from: classes6.dex */
public final class MultiGuestPlayerFreezeSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("is fix")
    public static final int FIX = 1;
    public static final MultiGuestPlayerFreezeSwitchSetting INSTANCE = new MultiGuestPlayerFreezeSwitchSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestPlayerFreezeSwitchSetting.class);
    }

    public final boolean isFix() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
