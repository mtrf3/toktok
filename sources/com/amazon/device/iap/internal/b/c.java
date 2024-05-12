package com.amazon.device.iap.internal.b;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

/* loaded from: classes.dex */
public final class c implements com.amazon.device.iap.internal.c {
    public static final String a = C16880lQ.LJLLJ(c.class);

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId) {
        com.amazon.device.iap.internal.util.e.a(a, "sendGetUserData");
        new com.amazon.device.iap.internal.b.e.a(requestId).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(Context context, Intent intent) {
        String str = a;
        com.amazon.device.iap.internal.util.e.a(str, "handleResponse");
        String LLJJIJIIJIL = C16880lQ.LLJJIJIIJIL(intent, "response_type");
        if (LLJJIJIIJIL == null) {
            com.amazon.device.iap.internal.util.e.a(str, "Invalid response type: null");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Found response type: ");
        LIZ.append(LLJJIJIIJIL);
        com.amazon.device.iap.internal.util.e.a(str, X1D.LIZIZ(LIZ));
        if ("purchase_response".equals(LLJJIJIIJIL)) {
            new com.amazon.device.iap.internal.b.a.d(RequestId.fromString(C16880lQ.LLJJIJIIJIL(intent, "requestId"))).e();
        }
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, String str) {
        com.amazon.device.iap.internal.util.e.a(a, "sendPurchaseRequest");
        new com.amazon.device.iap.internal.b.b.d(requestId, str).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, Set<String> set) {
        com.amazon.device.iap.internal.util.e.a(a, "sendGetProductDataRequest");
        new com.amazon.device.iap.internal.b.c.d(requestId, set).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, boolean z) {
        com.amazon.device.iap.internal.util.e.a(a, "sendGetPurchaseUpdates");
        new com.amazon.device.iap.internal.b.d.a(requestId, z).e();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        com.amazon.device.iap.internal.util.e.a(a, "sendNotifyFulfillment");
        new com.amazon.device.iap.internal.b.g.b(requestId, str, fulfillmentResult).e();
    }
}
