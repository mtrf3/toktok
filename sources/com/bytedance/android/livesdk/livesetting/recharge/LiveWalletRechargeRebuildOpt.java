package com.bytedance.android.livesdk.livesetting.recharge;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_wallet_recharge_rebuild_opt")
/* loaded from: classes6.dex */
public final class LiveWalletRechargeRebuildOpt {
    public static final LiveWalletRechargeRebuildOpt INSTANCE = new LiveWalletRechargeRebuildOpt();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveWalletRechargeRebuildOpt.class);
    }
}
