package com.bytedance.android.livesdk.livesetting.wallet;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SettingsKey("wallet_entrance_balance_override")
/* loaded from: classes6.dex */
public final class WalletEntranceBalanceShownSetting {

    @Group(isDefault = true, value = "Hide Entrance, Hide balance preview")
    public static final WalletEntranceConfig DEFAULT;
    public static final WalletEntranceBalanceShownSetting INSTANCE = new WalletEntranceBalanceShownSetting();

    @Group("Show Entrance, Hide balance preview")
    public static final WalletEntranceConfig CONTROL = new WalletEntranceConfig(true, false);

    @Group("Show Entrance, Show balance preview")
    public static final WalletEntranceConfig EXPERIMENT = new WalletEntranceConfig(true, true);

    static {
        boolean z = false;
        DEFAULT = new WalletEntranceConfig(z, z, 3, null);
    }

    private final WalletEntranceConfig getWalletEntranceConfig() {
        return (WalletEntranceConfig) SettingsManager.INSTANCE.getValueSafely(WalletEntranceBalanceShownSetting.class);
    }

    public final boolean shouldShowBalance() {
        try {
            WalletEntranceConfig walletEntranceConfig = getWalletEntranceConfig();
            if (walletEntranceConfig == null) {
                walletEntranceConfig = DEFAULT;
            }
            return walletEntranceConfig.getShowBalance();
        } catch (Throwable unused) {
            return DEFAULT.getShowBalance();
        }
    }

    public final boolean shouldShowWalletEntrance() {
        try {
            WalletEntranceConfig walletEntranceConfig = getWalletEntranceConfig();
            if (walletEntranceConfig == null) {
                walletEntranceConfig = DEFAULT;
            }
            return walletEntranceConfig.getShowInNavBar();
        } catch (Throwable unused) {
            return DEFAULT.getShowInNavBar();
        }
    }

    /* loaded from: classes6.dex */
    public static final class WalletEntranceConfig {

        @InterfaceC65349Pkn("show_balance")
        public boolean showBalance;

        @InterfaceC65349Pkn("show_entrance")
        public boolean showInNavBar;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public WalletEntranceConfig() {
            /*
                r3 = this;
                r2 = 3
                r1 = 0
                r0 = 0
                r3.<init>(r0, r0, r2, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.livesetting.wallet.WalletEntranceBalanceShownSetting.WalletEntranceConfig.<init>():void");
        }

        public final boolean getShowBalance() {
            return this.showBalance;
        }

        public final boolean getShowInNavBar() {
            return this.showInNavBar;
        }

        public final void setShowBalance(boolean z) {
            this.showBalance = z;
        }

        public final void setShowInNavBar(boolean z) {
            this.showInNavBar = z;
        }

        public WalletEntranceConfig(boolean z, boolean z2) {
            this.showInNavBar = z;
            this.showBalance = z2;
        }

        public /* synthetic */ WalletEntranceConfig(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
        }
    }

    public final WalletEntranceConfig getCONTROL() {
        return CONTROL;
    }

    public final WalletEntranceConfig getDEFAULT() {
        return DEFAULT;
    }

    public final WalletEntranceConfig getEXPERIMENT() {
        return EXPERIMENT;
    }
}
