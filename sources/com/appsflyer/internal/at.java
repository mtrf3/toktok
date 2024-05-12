package com.appsflyer.internal;

import X.C04910Hf;
import X.C0HE;
import X.C0HW;
import X.InterfaceC04930Hh;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class at implements C0HW {
    public /* synthetic */ av values;

    public at(av avVar) {
        this.values = avVar;
    }

    @Override // X.C0HW
    public final void onPurchasesUpdated(C0HE c0he, final List<Purchase> list) {
        final av avVar = this.values;
        try {
            if (c0he.LIZ == 0 && list != null) {
                if (avVar.AFInAppEventType == null) {
                    AFLogger.values("Got Ars billing callback but billing client is missing!");
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<Purchase> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getSku());
                }
                C04910Hf c04910Hf = new C04910Hf();
                c04910Hf.LIZ = "subs";
                c04910Hf.LIZIZ = new ArrayList(arrayList);
                avVar.AFInAppEventType.LIZ(c04910Hf.LIZ(), new InterfaceC04930Hh() { // from class: com.appsflyer.internal.av.4
                    public /* synthetic */ List AFInAppEventType;

                    public AnonymousClass4(final List list2) {
                        r2 = list2;
                    }

                    @Override // X.InterfaceC04930Hh
                    public final void onSkuDetailsResponse(C0HE c0he2, List<SkuDetails> list2) {
                        try {
                            if (c0he2.LIZ != 0 || list2 == null) {
                                return;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            Iterator<SkuDetails> it2 = list2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(it2.next().LIZ());
                            }
                            ArrayList arrayList3 = new ArrayList();
                            for (Purchase purchase : r2) {
                                if (arrayList2.contains(purchase.getSku())) {
                                    arrayList3.add(purchase);
                                }
                            }
                            if (!arrayList3.isEmpty()) {
                                av.AFKeystoreWrapper(av.this, false, arrayList3);
                            }
                        } catch (Throwable th) {
                            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                                AFLogger.values("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
                            }
                            AFLogger.values("Failed to log new purchase", th);
                        }
                    }
                });
                return;
            }
            AFLogger.values("Failed to setup Ars Play billing service: " + c0he.LIZ + " " + c0he.LIZIZ);
        } catch (Throwable th) {
            if ((th instanceof NoSuchMethodError) || (th instanceof NoClassDefFoundError)) {
                AFLogger.values("It seems your app uses different Play Billing library version than the SDK. Please use v.3.0.3");
            }
            AFLogger.values("Failed to query new purchase details", th);
        }
    }
}
