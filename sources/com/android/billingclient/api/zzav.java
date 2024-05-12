package com.android.billingclient.api;

import X.C0H4;
import X.C0HE;
import X.C0HJ;
import X.C0HU;
import X.C0HW;
import X.InterfaceC04820Gw;
import X.InterfaceC04930Hh;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzav implements InterfaceC04820Gw, C0H4, C0HJ, C0HU, C0HW, InterfaceC04930Hh {
    public static native void nativeOnAcknowledgePurchaseResponse(int i, String str, long j);

    public static native void nativeOnBillingServiceDisconnected();

    public static native void nativeOnBillingSetupFinished(int i, String str, long j);

    public static native void nativeOnConsumePurchaseResponse(int i, String str, String str2, long j);

    public static native void nativeOnPriceChangeConfirmationResult(int i, String str, long j);

    public static native void nativeOnPurchaseHistoryResponse(int i, String str, PurchaseHistoryRecord[] purchaseHistoryRecordArr, long j);

    public static native void nativeOnPurchasesUpdated(int i, String str, Purchase[] purchaseArr);

    public static native void nativeOnQueryPurchasesResponse(int i, String str, Purchase[] purchaseArr, long j);

    public static native void nativeOnSkuDetailsResponse(int i, String str, SkuDetails[] skuDetailsArr, long j);

    @Override // X.C0H4
    public final void onBillingServiceDisconnected() {
        nativeOnBillingServiceDisconnected();
    }

    @Override // X.InterfaceC04820Gw
    public final void LIZJ(C0HE c0he) {
        nativeOnAcknowledgePurchaseResponse(c0he.LIZ, c0he.LIZIZ, 0L);
    }

    @Override // X.C0H4
    public final void onBillingSetupFinished(C0HE c0he) {
        nativeOnBillingSetupFinished(c0he.LIZ, c0he.LIZIZ, 0L);
    }

    @Override // X.C0HJ
    public final void LIZ(C0HE c0he, String str) {
        nativeOnConsumePurchaseResponse(c0he.LIZ, c0he.LIZIZ, str, 0L);
    }

    @Override // X.C0HU
    public final void LIZIZ(C0HE c0he, List<Purchase> list) {
        nativeOnQueryPurchasesResponse(c0he.LIZ, c0he.LIZIZ, (Purchase[]) list.toArray(new Purchase[list.size()]), 0L);
    }

    @Override // X.C0HW
    public final void onPurchasesUpdated(C0HE c0he, List<Purchase> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnPurchasesUpdated(c0he.LIZ, c0he.LIZIZ, (Purchase[]) list.toArray(new Purchase[list.size()]));
    }

    @Override // X.InterfaceC04930Hh
    public final void onSkuDetailsResponse(C0HE c0he, List<SkuDetails> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        nativeOnSkuDetailsResponse(c0he.LIZ, c0he.LIZIZ, (SkuDetails[]) list.toArray(new SkuDetails[list.size()]), 0L);
    }
}
