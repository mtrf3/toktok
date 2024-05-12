package com.amazon.device.iap.internal.b.g;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class b extends e {
    public final String a;
    public final FulfillmentResult b;

    @Override // com.amazon.device.iap.internal.b.e
    public void a() {
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void b() {
        String c;
        FulfillmentResult fulfillmentResult = FulfillmentResult.FULFILLED;
        FulfillmentResult fulfillmentResult2 = this.b;
        if ((fulfillmentResult == fulfillmentResult2 || FulfillmentResult.UNAVAILABLE == fulfillmentResult2) && (c = com.amazon.device.iap.internal.c.a.a().c(this.a)) != null) {
            new com.amazon.device.iap.internal.b.f.b(this, c).a_();
            com.amazon.device.iap.internal.c.a.a().a(this.a);
        }
    }

    public b(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        super(requestId);
        HashSet hashSet = new HashSet();
        hashSet.add(str);
        this.a = str;
        this.b = fulfillmentResult;
        a((i) new a(this, hashSet, fulfillmentResult.toString()));
    }
}
