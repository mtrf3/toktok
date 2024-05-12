package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("wallet_panel_query_time_out")
/* loaded from: classes6.dex */
public final class LiveWalletQueryProductTimeOut {
    public static final LiveWalletQueryProductTimeOut INSTANCE = new LiveWalletQueryProductTimeOut();

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = 15;

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveWalletQueryProductTimeOut.class);
    }
}
