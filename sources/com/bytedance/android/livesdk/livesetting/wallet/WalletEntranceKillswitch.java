package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("wallet_entrance_kill_switch")
/* loaded from: classes6.dex */
public final class WalletEntranceKillswitch {

    @Group("Enable API and experiments")
    public static final boolean EXPERIMENT = false;
    public static final WalletEntranceKillswitch INSTANCE = new WalletEntranceKillswitch();

    @Group(isDefault = true, value = "Disable Wallet entrance outright")
    public static final boolean DEFAULT = true;

    public final boolean isWalletEntranceKillswitchEnabled() {
        try {
            return SettingsManager.INSTANCE.getBooleanValue(WalletEntranceKillswitch.class);
        } catch (Throwable unused) {
            return DEFAULT;
        }
    }

    public final boolean getDEFAULT() {
        return DEFAULT;
    }

    public final boolean getEXPERIMENT() {
        return EXPERIMENT;
    }
}
