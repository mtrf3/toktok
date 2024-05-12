package com.amazon.device.iap.internal.b.a;

import X.C16880lQ;
import X.X1D;
import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.venezia.command.SuccessResult;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a extends c {
    public static final String a = C16880lQ.LJLLJ(a.class);

    public a(e eVar) {
        super(eVar, "2.0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.amazon.device.iap.model.Receipt] */
    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        Receipt receipt;
        Map data = successResult.getData();
        String str = a;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data: ");
        LIZ.append(data);
        com.amazon.device.iap.internal.util.e.a(str, X1D.LIZIZ(LIZ));
        String str2 = (String) getCommandData().get("requestId");
        String str3 = (String) data.get("userId");
        String str4 = (String) data.get("marketplace");
        String str5 = (String) data.get("receipt");
        if (com.amazon.device.iap.internal.util.d.a(str5)) {
            a(str3, str4, str2, PurchaseResponse.RequestStatus.FAILED);
            return false;
        }
        JSONObject jSONObject = new JSONObject(str5);
        PurchaseResponse.RequestStatus safeValueOf = PurchaseResponse.RequestStatus.safeValueOf(JSONObjectProtectorUtils.getString(jSONObject, "orderStatus"));
        if (safeValueOf == PurchaseResponse.RequestStatus.SUCCESSFUL) {
            try {
                str2 = com.amazon.device.iap.internal.util.a.a(jSONObject, str3, str2);
                receipt = str2;
            } catch (Throwable unused) {
                a(str3, str4, str2, PurchaseResponse.RequestStatus.FAILED);
                return false;
            }
        } else {
            receipt = null;
        }
        e b = b();
        UserDataBuilder userDataBuilder = new UserDataBuilder();
        userDataBuilder.setUserId(str3);
        userDataBuilder.setMarketplace(str4);
        UserData build = userDataBuilder.build();
        PurchaseResponseBuilder purchaseResponseBuilder = new PurchaseResponseBuilder();
        purchaseResponseBuilder.setRequestId(b.c());
        purchaseResponseBuilder.setRequestStatus(safeValueOf);
        purchaseResponseBuilder.setUserData(build);
        purchaseResponseBuilder.setReceipt(receipt);
        b.d().a(purchaseResponseBuilder.build());
        return true;
    }
}
