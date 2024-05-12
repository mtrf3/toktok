package com.bytedance.android.livesdk.livesetting.linkmic.cohost;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_cohost_reserve_button_color_opt")
/* loaded from: classes11.dex */
public final class CoHostListReservationButtonColorOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final CoHostListReservationButtonColorOptSetting INSTANCE = new CoHostListReservationButtonColorOptSetting();

    public final boolean isEnable() {
        return SettingsManager.INSTANCE.getBooleanValue(CoHostListReservationButtonColorOptSetting.class);
    }
}
