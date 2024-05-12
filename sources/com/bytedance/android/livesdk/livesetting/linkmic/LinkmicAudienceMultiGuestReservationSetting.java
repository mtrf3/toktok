package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "linkmic_audience_multi_guest_reservation")
/* loaded from: classes6.dex */
public final class LinkmicAudienceMultiGuestReservationSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LinkmicAudienceMultiGuestReservationSetting INSTANCE = new LinkmicAudienceMultiGuestReservationSetting();

    @Group("guest can reserve")
    public static final int RESERVE = 1;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkmicAudienceMultiGuestReservationSetting.class);
    }

    public final boolean isReserve() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
