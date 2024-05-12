package com.amazon.device.iap.internal.b.a;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;

/* loaded from: classes.dex */
public final class d extends e {
    @Override // com.amazon.device.iap.internal.b.e
    public void a() {
        boolean z;
        PurchaseResponse purchaseResponse = (PurchaseResponse) d().a();
        if (purchaseResponse == null) {
            return;
        }
        Receipt receipt = purchaseResponse.getReceipt();
        if (receipt != null) {
            z = true;
        } else {
            z = false;
        }
        i cVar = new com.amazon.device.iap.internal.b.f.c(this, z);
        if (z && (ProductType.ENTITLED == receipt.getProductType() || ProductType.SUBSCRIPTION == receipt.getProductType())) {
            cVar.b(new com.amazon.device.iap.internal.b.f.b(this, c().toString()));
        }
        a(purchaseResponse, cVar);
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void b() {
        Object a = d().a();
        if (a == null) {
            PurchaseResponseBuilder purchaseResponseBuilder = new PurchaseResponseBuilder();
            purchaseResponseBuilder.setRequestId(c());
            purchaseResponseBuilder.setRequestStatus(PurchaseResponse.RequestStatus.FAILED);
            a = purchaseResponseBuilder.build();
        }
        a(a, new com.amazon.device.iap.internal.b.f.c(this, false));
    }

    public d(RequestId requestId) {
        super(requestId);
        a aVar = new a(this);
        aVar.b(new b(this));
        a((i) aVar);
    }
}
