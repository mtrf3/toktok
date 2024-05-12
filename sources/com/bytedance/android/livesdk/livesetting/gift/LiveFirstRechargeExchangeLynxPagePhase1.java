package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_first_recharge_exchange_lynx_page_phase1")
/* loaded from: classes6.dex */
public final class LiveFirstRechargeExchangeLynxPagePhase1 {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveFirstRechargeExchangeLynxPagePhase1 INSTANCE = new LiveFirstRechargeExchangeLynxPagePhase1();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveFirstRechargeExchangeLynxPagePhase1.class);
    }

    public final boolean inExp() {
        if (getValue() != 0) {
            return true;
        }
        return false;
    }
}
