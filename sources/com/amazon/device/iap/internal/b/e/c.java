package com.amazon.device.iap.internal.b.e;

import X.C16880lQ;
import X.X1D;
import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.b.h;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.amazon.venezia.command.SuccessResult;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends b {
    public static final String b = C16880lQ.LJLLJ(c.class);

    public c(e eVar) {
        super(eVar, "2.0");
    }

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        String str = b;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onResult: result = ");
        LIZ.append(successResult);
        com.amazon.device.iap.internal.util.e.a(str, X1D.LIZIZ(LIZ));
        Map data = successResult.getData();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("data: ");
        LIZ2.append(data);
        com.amazon.device.iap.internal.util.e.a(str, X1D.LIZIZ(LIZ2));
        String str2 = (String) data.get("userId");
        String str3 = (String) data.get("marketplace");
        e b2 = b();
        if (com.amazon.device.iap.internal.util.d.a(str2) || com.amazon.device.iap.internal.util.d.a(str3)) {
            h d = b2.d();
            UserDataResponseBuilder userDataResponseBuilder = new UserDataResponseBuilder();
            userDataResponseBuilder.setRequestId(b2.c());
            userDataResponseBuilder.setRequestStatus(UserDataResponse.RequestStatus.FAILED);
            d.a(userDataResponseBuilder.build());
            return false;
        }
        UserDataBuilder userDataBuilder = new UserDataBuilder();
        userDataBuilder.setUserId(str2);
        userDataBuilder.setMarketplace(str3);
        UserData build = userDataBuilder.build();
        UserDataResponseBuilder userDataResponseBuilder2 = new UserDataResponseBuilder();
        userDataResponseBuilder2.setRequestId(b2.c());
        userDataResponseBuilder2.setRequestStatus(UserDataResponse.RequestStatus.SUCCESSFUL);
        userDataResponseBuilder2.setUserData(build);
        UserDataResponse build2 = userDataResponseBuilder2.build();
        b2.d().a("userId", build.getUserId());
        b2.d().a(build2);
        return true;
    }
}
