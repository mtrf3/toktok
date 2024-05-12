package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C58510Mxm;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_gift_tray_multi_guest_opt")
/* loaded from: classes11.dex */
public final class LiveMultiGuestGiftTrayOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMultiGuestGiftTrayOptSetting INSTANCE = new LiveMultiGuestGiftTrayOptSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C58510Mxm.LJLIL);

    public static final boolean enableGiftTrayPositionChange() {
        LiveMultiGuestGiftTrayOptSetting liveMultiGuestGiftTrayOptSetting = INSTANCE;
        if (liveMultiGuestGiftTrayOptSetting.getValue() == 1 || liveMultiGuestGiftTrayOptSetting.getValue() == 2) {
            return true;
        }
        return false;
    }

    private final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveMultiGuestGiftTrayOptSetting.class);
    }

    public final boolean isOptimizeMultiGuest() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }
}
