package com.appsflyer.internal;

import X.C0H4;
import X.C0HE;
import com.android.billingclient.api.Purchase;
import com.appsflyer.AFLogger;
import java.util.List;

/* loaded from: classes.dex */
public final class aw implements C0H4 {
    public /* synthetic */ av values;

    @Override // X.C0H4
    public final void onBillingServiceDisconnected() {
    }

    public aw(av avVar) {
        this.values = avVar;
    }

    @Override // X.C0H4
    public final void onBillingSetupFinished(final C0HE c0he) {
        final av avVar = this.values;
        avVar.values.submit(new Runnable() { // from class: com.appsflyer.internal.av.5
            public /* synthetic */ C0HE AFKeystoreWrapper;

            @Override // java.lang.Runnable
            public final void run() {
                com_appsflyer_internal_av$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public final void com_appsflyer_internal_av$5__run$___twin___() {
                try {
                    if (r2.LIZ != 0 || av.this.valueOf.AFInAppEventType("ars_history_sent")) {
                        return;
                    }
                    Purchase.PurchasesResult queryPurchases = av.this.AFInAppEventType.queryPurchases("subs");
                    List purchasesList = queryPurchases.getPurchasesList();
                    if (queryPurchases.getResponseCode() == 0 && purchasesList != null && !purchasesList.isEmpty()) {
                        av.AFKeystoreWrapper(av.this, true, purchasesList);
                    } else {
                        AFLogger.values("Failed to query purchases history");
                    }
                } catch (Throwable th) {
                    if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                        AFLogger.values("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                    }
                    AFLogger.values("Failed to log purchases history", th);
                }
            }

            public static void com_appsflyer_internal_av$5_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass5 anonymousClass5) {
                boolean LIZ;
                try {
                    anonymousClass5.com_appsflyer_internal_av$5__run$___twin___();
                } finally {
                    if (LIZ) {
                    }
                }
            }

            public AnonymousClass5(final C0HE c0he2) {
                r2 = c0he2;
            }
        });
    }
}
