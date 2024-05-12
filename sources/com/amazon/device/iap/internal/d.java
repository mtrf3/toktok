package com.amazon.device.iap.internal;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class d {
    public static String a = C16880lQ.LJLLJ(d.class);
    public static String b = "sku";
    public static d c = new d();
    public final c d = e.b();
    public Context e;
    public PurchasingListener f;

    private void e() {
        if (this.f != null) {
        } else {
            throw new IllegalStateException("You must register a PurchasingListener before invoking this operation");
        }
    }

    public RequestId c() {
        e();
        RequestId requestId = new RequestId();
        this.d.a(requestId);
        return requestId;
    }

    public static d d() {
        return c;
    }

    public PurchasingListener a() {
        return this.f;
    }

    public Context b() {
        return this.e;
    }

    public RequestId a(Set<String> set) {
        com.amazon.device.iap.internal.util.d.a((Object) set, "skus");
        com.amazon.device.iap.internal.util.d.a((Collection<? extends Object>) set, "skus");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            if (it.next().trim().length() == 0) {
                throw new IllegalArgumentException("Empty SKU values are not allowed");
            }
        }
        if (set.size() <= 100) {
            e();
            RequestId requestId = new RequestId();
            this.d.a(requestId, new LinkedHashSet(set));
            return requestId;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(set.size());
        LIZ.append(" SKUs were provided, but no more than ");
        LIZ.append(100);
        LIZ.append(" SKUs are allowed");
        throw new IllegalArgumentException(X1D.LIZIZ(LIZ));
    }

    public RequestId a(String str) {
        com.amazon.device.iap.internal.util.d.a((Object) str, b);
        e();
        RequestId requestId = new RequestId();
        this.d.a(requestId, str);
        return requestId;
    }

    public RequestId a(boolean z) {
        e();
        RequestId requestId = new RequestId();
        this.d.a(requestId, z);
        return requestId;
    }

    public void a(Context context, PurchasingListener purchasingListener) {
        String str = a;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PurchasingListener registered: ");
        LIZ.append(purchasingListener);
        com.amazon.device.iap.internal.util.e.a(str, X1D.LIZIZ(LIZ));
        String str2 = a;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("PurchasingListener Context: ");
        LIZ2.append(context);
        com.amazon.device.iap.internal.util.e.a(str2, X1D.LIZIZ(LIZ2));
        if (purchasingListener != null && context != null) {
            this.e = C16880lQ.LLLLL(context);
            this.f = purchasingListener;
            return;
        }
        throw new IllegalArgumentException("Neither PurchasingListener or its Context can be null");
    }

    public void a(String str, FulfillmentResult fulfillmentResult) {
        if (!com.amazon.device.iap.internal.util.d.a(str)) {
            com.amazon.device.iap.internal.util.d.a(fulfillmentResult, "fulfillmentResult");
            e();
            this.d.a(new RequestId(), str, fulfillmentResult);
            return;
        }
        throw new IllegalArgumentException("Empty receiptId is not allowed");
    }

    public void a(Context context, Intent intent) {
        try {
            this.d.a(context, intent);
        } catch (Exception e) {
            String str = a;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error in onReceive: ");
            LIZ.append(e);
            com.amazon.device.iap.internal.util.e.b(str, X1D.LIZIZ(LIZ));
        }
    }
}
