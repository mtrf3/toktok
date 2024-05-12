package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C58575Myp;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey(preciseExperiment = false, value = "live_gift_tray_multi_host_opt")
/* loaded from: classes11.dex */
public final class LiveMultiHostGiftTrayOptSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveMultiHostGiftTrayOptSetting INSTANCE = new LiveMultiHostGiftTrayOptSetting();
    public static final C5H3 settingValue$delegate = C221108m2.LIZIZ(C58575Myp.LJLIL);

    public static final boolean enableGiftTrayPositionChange() {
        LiveMultiHostGiftTrayOptSetting liveMultiHostGiftTrayOptSetting = INSTANCE;
        if (liveMultiHostGiftTrayOptSetting.getSettingValue() == 1 || liveMultiHostGiftTrayOptSetting.getSettingValue() == 2 || liveMultiHostGiftTrayOptSetting.getSettingValue() == 3) {
            return true;
        }
        return false;
    }

    public static final boolean enablePublicScreenHeightChange() {
        LiveMultiHostGiftTrayOptSetting liveMultiHostGiftTrayOptSetting = INSTANCE;
        if (liveMultiHostGiftTrayOptSetting.getSettingValue() == 1 || liveMultiHostGiftTrayOptSetting.getSettingValue() == 3) {
            return true;
        }
        return false;
    }

    private final int getSettingValue() {
        return ((Number) settingValue$delegate.getValue()).intValue();
    }

    public static final boolean isFloatingGiftTray() {
        if (INSTANCE.getSettingValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isBackgroundCoverAllViews() {
        if (getSettingValue() != 1) {
            return true;
        }
        return false;
    }

    public final boolean isMediumGiftTray() {
        if (getSettingValue() == 1 || getSettingValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean isOptimizeMultiHost() {
        if (getSettingValue() != 0) {
            return true;
        }
        return false;
    }

    public final boolean isSmallDevice() {
        if (getSettingValue() == 4) {
            return true;
        }
        return false;
    }

    public final boolean isTinyGiftTray() {
        if (getSettingValue() == 3 || getSettingValue() == 4) {
            return true;
        }
        return false;
    }
}
