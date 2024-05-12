package com.bytedance.android.livesdk.livesetting.wallet;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("wallet_entrance_move")
/* loaded from: classes6.dex */
public final class WalletEntranceLocationMoveSetting {

    @Group(isDefault = true, value = "Display in Settings and privacy")
    public static final boolean DEFAULT = false;
    public static final WalletEntranceLocationMoveSetting INSTANCE = new WalletEntranceLocationMoveSetting();

    @Group("Display in Settings Menu")
    public static final boolean EXPERIMENT = true;

    public final boolean shouldDisplayInSettingsNavBar() {
        try {
            return SettingsManager.INSTANCE.getBooleanValue(WalletEntranceLocationMoveSetting.class);
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
