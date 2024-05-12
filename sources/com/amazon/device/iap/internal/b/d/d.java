package com.amazon.device.iap.internal.b.d;

import X.C16880lQ;
import X.X1D;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.UserData;
import com.amazon.venezia.command.SuccessResult;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public final class d extends b {
    public static final String b = C16880lQ.LJLLJ(d.class);
    public static final Date c = new Date(0);

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        Map data = successResult.getData();
        String str = b;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data: ");
        LIZ.append(data);
        e.a(str, X1D.LIZIZ(LIZ));
        String str2 = (String) data.get("userId");
        data.get("requestId");
        String str3 = (String) data.get("marketplace");
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray((String) data.get("receipts"));
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                Receipt a = com.amazon.device.iap.internal.util.a.a(JSONArrayProtectorUtils.getJSONObject(jSONArray, i), str2, null);
                arrayList.add(a);
                if (ProductType.ENTITLED == a.getProductType()) {
                    com.amazon.device.iap.internal.c.c.a().a(str2, a.getReceiptId(), a.getSku());
                }
            } catch (com.amazon.device.iap.internal.b.a e) {
                String str4 = b;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("fail to parse receipt, requestId:");
                LIZ2.append(e.a());
                e.b(str4, X1D.LIZIZ(LIZ2));
            } catch (com.amazon.device.iap.internal.b.d e2) {
                String str5 = b;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("fail to verify receipt, requestId:");
                LIZ3.append(e2.a());
                e.b(str5, X1D.LIZIZ(LIZ3));
            } catch (Throwable th) {
                String str6 = b;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("fail to verify receipt, requestId:");
                LIZ4.append(th.getMessage());
                e.b(str6, X1D.LIZIZ(LIZ4));
            }
        }
        JSONArray jSONArray2 = new JSONArray((String) data.get("revocations"));
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            try {
                String string = JSONArrayProtectorUtils.getString(jSONArray2, i2);
                String a2 = com.amazon.device.iap.internal.c.c.a().a(str2, string);
                ReceiptBuilder receiptBuilder = new ReceiptBuilder();
                receiptBuilder.setSku(string);
                receiptBuilder.setProductType(ProductType.ENTITLED);
                receiptBuilder.setPurchaseDate(null);
                receiptBuilder.setCancelDate(c);
                receiptBuilder.setReceiptId(a2);
                arrayList.add(receiptBuilder.build());
            } catch (JSONException unused) {
                String str7 = b;
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("fail to parse JSON[");
                LIZ5.append(i2);
                LIZ5.append("] in \"");
                LIZ5.append(jSONArray2);
                LIZ5.append("\"");
                e.b(str7, X1D.LIZIZ(LIZ5));
            }
        }
        Object obj = data.get("cursor");
        boolean equalsIgnoreCase = "true".equalsIgnoreCase((String) data.get("hasMore"));
        com.amazon.device.iap.internal.b.e b2 = b();
        UserDataBuilder userDataBuilder = new UserDataBuilder();
        userDataBuilder.setUserId(str2);
        userDataBuilder.setMarketplace(str3);
        UserData build = userDataBuilder.build();
        PurchaseUpdatesResponseBuilder purchaseUpdatesResponseBuilder = new PurchaseUpdatesResponseBuilder();
        purchaseUpdatesResponseBuilder.setRequestId(b2.c());
        purchaseUpdatesResponseBuilder.setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL);
        purchaseUpdatesResponseBuilder.setUserData(build);
        purchaseUpdatesResponseBuilder.setReceipts(arrayList);
        purchaseUpdatesResponseBuilder.setHasMore(equalsIgnoreCase);
        PurchaseUpdatesResponse build2 = purchaseUpdatesResponseBuilder.build();
        build2.getReceipts().addAll(com.amazon.device.iap.internal.c.a.a().b(build2.getUserData().getUserId()));
        b2.d().a(build2);
        b2.d().a("newCursor", obj);
        return true;
    }

    public d(com.amazon.device.iap.internal.b.e eVar, boolean z) {
        super(eVar, "1.0", z);
    }
}
