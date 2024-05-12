package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_reservation_red_dot_fix")
/* loaded from: classes6.dex */
public final class MultiGuestReservationRedDotFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestReservationRedDotFixSetting INSTANCE = new MultiGuestReservationRedDotFixSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestReservationRedDotFixSetting.class);
    }

    public final boolean isFix() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }
}