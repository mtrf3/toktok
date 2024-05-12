package com.amazon.device.iap.internal.b.a;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.UserData;

/* loaded from: classes.dex */
public abstract class c extends i {
    public c(e eVar, String str) {
        super(eVar, "purchase_response", str);
    }

    public void a(String str, String str2, String str3, PurchaseResponse.RequestStatus requestStatus) {
        e b = b();
        UserDataBuilder userDataBuilder = new UserDataBuilder();
        userDataBuilder.setUserId(str);
        userDataBuilder.setMarketplace(str2);
        UserData build = userDataBuilder.build();
        PurchaseResponseBuilder purchaseResponseBuilder = new PurchaseResponseBuilder();
        purchaseResponseBuilder.setRequestId(b.c());
        purchaseResponseBuilder.setRequestStatus(requestStatus);
        purchaseResponseBuilder.setUserData(build);
        purchaseResponseBuilder.setReceipt(null);
        b.d().a(purchaseResponseBuilder.build());
    }
}
