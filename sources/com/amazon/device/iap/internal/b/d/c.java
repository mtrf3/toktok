package com.amazon.device.iap.internal.b.d;

import X.C16880lQ;
import X.X1D;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.venezia.command.SuccessResult;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class c extends b {
    public static final String b = C16880lQ.LJLLJ(c.class);

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        Map data = successResult.getData();
        String str = b;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data: ");
        LIZ.append(data);
        e.a(str, X1D.LIZIZ(LIZ));
        String str2 = (String) data.get("userId");
        String str3 = (String) data.get("marketplace");
        List<Receipt> a = a(str2, (String) data.get("receipts"), (String) data.get("requestId"));
        Object obj = data.get("cursor");
        boolean booleanValue = Boolean.valueOf((String) data.get("hasMore")).booleanValue();
        com.amazon.device.iap.internal.b.e b2 = b();
        UserDataBuilder userDataBuilder = new UserDataBuilder();
        userDataBuilder.setUserId(str2);
        userDataBuilder.setMarketplace(str3);
        UserData build = userDataBuilder.build();
        PurchaseUpdatesResponseBuilder purchaseUpdatesResponseBuilder = new PurchaseUpdatesResponseBuilder();
        purchaseUpdatesResponseBuilder.setRequestId(b2.c());
        purchaseUpdatesResponseBuilder.setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL);
        purchaseUpdatesResponseBuilder.setUserData(build);
        purchaseUpdatesResponseBuilder.setReceipts(a);
        purchaseUpdatesResponseBuilder.setHasMore(booleanValue);
        PurchaseUpdatesResponse build2 = purchaseUpdatesResponseBuilder.build();
        b2.d().a("newCursor", obj);
        b2.d().a(build2);
        return true;
    }

    public c(com.amazon.device.iap.internal.b.e eVar, boolean z) {
        super(eVar, "2.0", z);
    }

    private List<Receipt> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(com.amazon.device.iap.internal.util.a.a(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), str, str3));
            } catch (com.amazon.device.iap.internal.b.a e) {
                String str4 = b;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("fail to parse receipt, requestId:");
                LIZ.append(e.a());
                e.b(str4, X1D.LIZIZ(LIZ));
            } catch (com.amazon.device.iap.internal.b.d e2) {
                String str5 = b;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("fail to verify receipt, requestId:");
                LIZ2.append(e2.a());
                e.b(str5, X1D.LIZIZ(LIZ2));
            } catch (Throwable th) {
                String str6 = b;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("fail to verify receipt, requestId:");
                LIZ3.append(th.getMessage());
                e.b(str6, X1D.LIZIZ(LIZ3));
            }
        }
        return arrayList;
    }
}
