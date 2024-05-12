package com.bytedance.android.livesdk.livesetting.wallet;

import X.FFL;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class LiveIapAdsFreeExperiment {
    public static final LiveIapAdsFreeExperiment INSTANCE = new LiveIapAdsFreeExperiment();
    public static final WalletIapBillingNew DEFAULT = new WalletIapBillingNew();

    public final boolean getIapBillingVersion() {
        return getValue().getEnableIapBillingNew();
    }

    public final WalletIapBillingNew getValue() {
        FFL LJIIIZ = FFL.LJIIIZ();
        WalletIapBillingNew walletIapBillingNew = DEFAULT;
        LJIIIZ.getClass();
        WalletIapBillingNew walletIapBillingNew2 = (WalletIapBillingNew) FFL.LJIJI(true, "ad_free", 31744, WalletIapBillingNew.class, walletIapBillingNew, 1);
        if (walletIapBillingNew2 != null) {
            walletIapBillingNew = walletIapBillingNew2;
        }
        o.LJIIIIZZ(walletIapBillingNew, "ABManager.getInstance().…nt::class.java)?: DEFAULT");
        return walletIapBillingNew;
    }

    /* loaded from: classes10.dex */
    public static final class WalletIapBillingNew {

        @InterfaceC65349Pkn("wallet_iap_billing_new")
        public final boolean enableIapBillingNew;

        public final boolean getEnableIapBillingNew() {
            return this.enableIapBillingNew;
        }
    }
}
