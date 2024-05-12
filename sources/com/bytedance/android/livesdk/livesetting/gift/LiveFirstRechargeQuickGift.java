package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_open_gift_panel_after_recharge")
/* loaded from: classes6.dex */
public final class LiveFirstRechargeQuickGift {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group("exp group")
    public static final int EXPERIMENT = 1;
    public static final LiveFirstRechargeQuickGift INSTANCE = new LiveFirstRechargeQuickGift();

    public final int getValue() {
        try {
            return SettingsManager.INSTANCE.getIntValue(LiveFirstRechargeQuickGift.class);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public final boolean inExp() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }
}
