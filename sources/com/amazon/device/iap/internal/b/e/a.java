package com.amazon.device.iap.internal.b.e;

import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.i;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataResponse;

/* loaded from: classes.dex */
public final class a extends e {
    @Override // com.amazon.device.iap.internal.b.e
    public void a() {
        a(d().a());
    }

    @Override // com.amazon.device.iap.internal.b.e
    public void b() {
        Object a = d().a();
        if (a == null) {
            UserDataResponseBuilder userDataResponseBuilder = new UserDataResponseBuilder();
            userDataResponseBuilder.setRequestId(c());
            userDataResponseBuilder.setRequestStatus(UserDataResponse.RequestStatus.FAILED);
            a = userDataResponseBuilder.build();
        }
        a(a);
    }

    public a(RequestId requestId) {
        super(requestId);
        c cVar = new c(this);
        cVar.b(new d(this));
        a((i) cVar);
    }
}
