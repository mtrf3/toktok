package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_education_guide_enable")
/* loaded from: classes6.dex */
public final class LiveGiftEducationGuideSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveGiftEducationGuideSetting INSTANCE = new LiveGiftEducationGuideSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGiftEducationGuideSetting.class);
    }

    public final boolean isEnable() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }

    public final boolean showDiscountGift() {
        if (getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean showEducationEntry() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean showFirstRechargePack() {
        if (getValue() == 0 || getValue() == 1) {
            return true;
        }
        return false;
    }

    public final boolean showGiftBanner() {
        if (getValue() == 3) {
            return true;
        }
        return false;
    }
}
