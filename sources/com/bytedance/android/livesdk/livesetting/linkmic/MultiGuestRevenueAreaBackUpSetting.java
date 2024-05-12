package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C58506Mxi;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "multi_guest_revenue_area_back_up")
/* loaded from: classes11.dex */
public final class MultiGuestRevenueAreaBackUpSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestRevenueAreaBackUpSetting INSTANCE = new MultiGuestRevenueAreaBackUpSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C58506Mxi.LJLIL);

    private final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestRevenueAreaBackUpSetting.class);
    }

    public final boolean isShieldUs() {
        if (getSettingValue() == 0) {
            return true;
        }
        return false;
    }
}
