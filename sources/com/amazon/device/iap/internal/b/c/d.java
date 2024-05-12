package com.amazon.device.iap.internal.b.c;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.RequestId;
import java.util.Set;

/* loaded from: classes.dex */
public final class d extends e {
    @Override // com.amazon.device.iap.internal.b.e
    public void a() {
        a(d().a());
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void b() {
        Object a = d().a();
        if (a == null) {
            ProductDataResponseBuilder productDataResponseBuilder = new ProductDataResponseBuilder();
            productDataResponseBuilder.setRequestId(c());
            productDataResponseBuilder.setRequestStatus(ProductDataResponse.RequestStatus.FAILED);
            a = productDataResponseBuilder.build();
        }
        a(a);
    }

    public d(RequestId requestId, Set<String> set) {
        super(requestId);
        a aVar = new a(this, set);
        aVar.b(new b(this, set));
        a((i) aVar);
    }
}
