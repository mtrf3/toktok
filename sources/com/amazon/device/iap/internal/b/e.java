package com.amazon.device.iap.internal.b;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.os.Handler;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;

/* loaded from: classes.dex */
public class e {
    public static final String a = C16880lQ.LJLLJ(e.class);
    public final RequestId b;
    public final h c = new h();
    public i d = null;

    public void a() {
    }

    public void b() {
    }

    public void e() {
        i iVar = this.d;
        if (iVar != null) {
            iVar.a_();
        } else {
            a();
        }
    }

    public RequestId c() {
        return this.b;
    }

    public h d() {
        return this.c;
    }

    public e(RequestId requestId) {
        this.b = requestId;
    }

    public void a(Object obj) {
        a(obj, null);
    }

    public void a(i iVar) {
        this.d = iVar;
    }

    public void a(final Object obj, final i iVar) {
        com.amazon.device.iap.internal.util.d.a(obj, "response");
        Context b = com.amazon.device.iap.internal.d.d().b();
        final PurchasingListener a2 = com.amazon.device.iap.internal.d.d().a();
        if (b == null || a2 == null) {
            String str = a;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PurchasingListener is not set. Dropping response: ");
            LIZ.append(obj);
            com.amazon.device.iap.internal.util.e.a(str, X1D.LIZIZ(LIZ));
            return;
        }
        new Handler(b.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.iap.internal.b.e.1
            @Override // java.lang.Runnable
            public void run() {
                com_amazon_device_iap_internal_b_e$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_amazon_device_iap_internal_b_e$1__run$___twin___() {
                e.this.d().a("notifyListenerResult", Boolean.FALSE);
                try {
                    Object obj2 = obj;
                    if (obj2 instanceof ProductDataResponse) {
                        a2.onProductDataResponse((ProductDataResponse) obj2);
                    } else if (obj2 instanceof UserDataResponse) {
                        a2.onUserDataResponse((UserDataResponse) obj2);
                    } else if (obj2 instanceof PurchaseUpdatesResponse) {
                        PurchaseUpdatesResponse purchaseUpdatesResponse = (PurchaseUpdatesResponse) obj2;
                        a2.onPurchaseUpdatesResponse(purchaseUpdatesResponse);
                        Object a3 = e.this.d().a("newCursor");
                        if (a3 != null && (a3 instanceof String)) {
                            com.amazon.device.iap.internal.util.b.a(purchaseUpdatesResponse.getUserData().getUserId(), a3.toString());
                        }
                    } else if (obj2 instanceof PurchaseResponse) {
                        a2.onPurchaseResponse((PurchaseResponse) obj2);
                    } else {
                        String str2 = e.a;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Unknown response type:");
                        LIZ2.append(obj.getClass().getName());
                        com.amazon.device.iap.internal.util.e.b(str2, X1D.LIZIZ(LIZ2));
                    }
                    e.this.d().a("notifyListenerResult", Boolean.TRUE);
                } catch (Throwable th) {
                    String str3 = e.a;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Error in sendResponse: ");
                    LIZ3.append(th);
                    com.amazon.device.iap.internal.util.e.b(str3, X1D.LIZIZ(LIZ3));
                }
                i iVar2 = iVar;
                if (iVar2 != null) {
                    iVar2.a(true);
                    iVar.a_();
                }
            }

            public static void com_amazon_device_iap_internal_b_e$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ2;
                try {
                    anonymousClass1.com_amazon_device_iap_internal_b_e$1__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }
}
