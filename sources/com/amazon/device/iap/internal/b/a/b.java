package com.amazon.device.iap.internal.b.a;

import X.C16880lQ;
import X.X1D;
import com.amazon.device.iap.internal.b.e;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.venezia.command.SuccessResult;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b extends c {
    public static final String a = C16880lQ.LJLLJ(b.class);

    public b(e eVar) {
        super(eVar, "1.0");
    }

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        Receipt a2;
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
        if (str2 == null || !com.amazon.device.iap.internal.c.b.a().a(str2)) {
            b().d().b();
            return true;
        }
        if (com.amazon.device.iap.internal.util.d.a(str5)) {
            a(str3, str4, str2, PurchaseResponse.RequestStatus.FAILED);
            return false;
        }
        JSONObject jSONObject = new JSONObject(str5);
        PurchaseResponse.RequestStatus safeValueOf = PurchaseResponse.RequestStatus.safeValueOf(JSONObjectProtectorUtils.getString(jSONObject, "orderStatus"));
        if (safeValueOf == PurchaseResponse.RequestStatus.SUCCESSFUL) {
            try {
                a2 = com.amazon.device.iap.internal.util.a.a(jSONObject, str3, str2);
                if (ProductType.CONSUMABLE == a2.getProductType()) {
                    a(str2, str3, str5);
                }
            } catch (Throwable unused) {
                a(str3, str4, str2, PurchaseResponse.RequestStatus.FAILED);
                return false;
            }
        } else {
            a2 = null;
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
        purchaseResponseBuilder.setReceipt(a2);
        b.d().a(purchaseResponseBuilder.build());
        return true;
    }

    private void a(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str3);
            if (PurchaseResponse.RequestStatus.safeValueOf(JSONObjectProtectorUtils.getString(jSONObject, "orderStatus")) != PurchaseResponse.RequestStatus.SUCCESSFUL) {
                return;
            }
            com.amazon.device.iap.internal.c.a.a().a(str, str2, com.amazon.device.iap.internal.util.a.a(jSONObject, str2, str).getReceiptId(), str3);
        } catch (Throwable th) {
            String str4 = a;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error in savePendingReceipt: ");
            LIZ.append(th);
            com.amazon.device.iap.internal.util.e.b(str4, X1D.LIZIZ(LIZ));
        }
    }
}
