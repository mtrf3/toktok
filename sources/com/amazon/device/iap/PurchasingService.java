package com.amazon.device.iap;

import X.C16880lQ;
import android.content.Context;
import com.amazon.device.iap.internal.d;
import com.amazon.device.iap.internal.e;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

/* loaded from: classes.dex */
public final class PurchasingService {
    public static final String TAG = C16880lQ.LJLLJ(PurchasingService.class);
    public static final boolean IS_SANDBOX_MODE = e.a();

    public static RequestId getUserData() {
        return d.d().c();
    }

    public static RequestId getProductData(Set<String> set) {
        return d.d().a(set);
    }

    public static RequestId getPurchaseUpdates(boolean z) {
        return d.d().a(z);
    }

    public static RequestId purchase(String str) {
        return d.d().a(str);
    }

    public static void notifyFulfillment(String str, FulfillmentResult fulfillmentResult) {
        d.d().a(str, fulfillmentResult);
    }

    public static void registerListener(Context context, PurchasingListener purchasingListener) {
        d.d().a(context, purchasingListener);
    }
}
