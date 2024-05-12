package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_first_recharge_extra_rebates_type")
/* loaded from: classes6.dex */
public final class LiveFirstRechargeGivingCountSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveFirstRechargeGivingCountSetting INSTANCE = new LiveFirstRechargeGivingCountSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveFirstRechargeGivingCountSetting.class);
    }

    public final boolean giftPanelIncludeGivingCount() {
        if (getValue() == 0 || getValue() == 2) {
            return true;
        }
        return false;
    }

    public final boolean rechargePanelIncludeGivingCount() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }
}
