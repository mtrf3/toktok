package com.amazon.device.iap.internal.a;

import X.C16880lQ;
import X.X1D;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.ReceiptBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c implements com.amazon.device.iap.internal.c {
    public static final String a = C16880lQ.LJLLJ(c.class);

    private Receipt a(JSONObject jSONObject) {
        Date date;
        String optString = jSONObject.optString("receiptId");
        String optString2 = jSONObject.optString("sku");
        ProductType valueOf = ProductType.valueOf(jSONObject.optString("itemType"));
        String optString3 = jSONObject.optString("purchaseDate");
        DateFormat dateFormat = b.a;
        Date parse = dateFormat.parse(optString3);
        String optString4 = jSONObject.optString("cancelDate");
        if (optString4 == null || optString4.length() == 0) {
            date = null;
        } else {
            date = dateFormat.parse(optString4);
        }
        ReceiptBuilder receiptBuilder = new ReceiptBuilder();
        receiptBuilder.setReceiptId(optString);
        receiptBuilder.setSku(optString2);
        receiptBuilder.setProductType(valueOf);
        receiptBuilder.setPurchaseDate(parse);
        receiptBuilder.setCancelDate(date);
        return receiptBuilder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.amazon.device.iap.model.RequestId] */
    private PurchaseUpdatesResponse b(Intent intent) {
        UserData userData;
        ArrayList arrayList;
        RequestId requestId;
        boolean z;
        ?? r5;
        ?? r4;
        JSONObject jSONObject;
        PurchaseUpdatesResponse.RequestStatus requestStatus = PurchaseUpdatesResponse.RequestStatus.FAILED;
        ArrayList arrayList2 = null;
        int i = 0;
        try {
            jSONObject = new JSONObject(C16880lQ.LLJJIJIIJIL(intent, "purchaseUpdatesOutput"));
            r5 = RequestId.fromString(jSONObject.optString("requestId"));
            try {
                requestStatus = PurchaseUpdatesResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                r4 = jSONObject.optBoolean("isMore");
                try {
                    String optString = jSONObject.optString("userId");
                    String optString2 = jSONObject.optString("marketplace");
                    UserDataBuilder userDataBuilder = new UserDataBuilder();
                    userDataBuilder.setUserId(optString);
                    userDataBuilder.setMarketplace(optString2);
                    userData = userDataBuilder.build();
                    try {
                        z = r4;
                        requestId = r5;
                    } catch (Exception unused) {
                        arrayList = null;
                        i = r4 == true ? 1 : 0;
                        arrayList2 = r5;
                        r5 = arrayList2;
                        r4 = i;
                        arrayList2 = arrayList;
                        z = r4;
                        requestId = r5;
                        PurchaseUpdatesResponseBuilder purchaseUpdatesResponseBuilder = new PurchaseUpdatesResponseBuilder();
                        purchaseUpdatesResponseBuilder.setRequestId(requestId);
                        purchaseUpdatesResponseBuilder.setRequestStatus(requestStatus);
                        purchaseUpdatesResponseBuilder.setUserData(userData);
                        purchaseUpdatesResponseBuilder.setReceipts(arrayList2);
                        purchaseUpdatesResponseBuilder.setHasMore(z);
                        return purchaseUpdatesResponseBuilder.build();
                    }
                } catch (Exception unused2) {
                    userData = null;
                    arrayList = null;
                }
            } catch (Exception unused3) {
                userData = null;
                arrayList = null;
            }
        } catch (Exception unused4) {
            userData = null;
            arrayList = null;
        }
        if (requestStatus == PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
            arrayList = new ArrayList();
            try {
                JSONArray optJSONArray = jSONObject.optJSONArray("receipts");
                if (optJSONArray != null) {
                    while (i < optJSONArray.length()) {
                        try {
                            arrayList.add(a(optJSONArray.optJSONObject(i)));
                        } catch (Exception unused5) {
                        }
                        i++;
                    }
                }
            } catch (Exception unused6) {
                arrayList2 = r5;
                i = r4 == true ? 1 : 0;
                r5 = arrayList2;
                r4 = i;
                arrayList2 = arrayList;
                z = r4;
                requestId = r5;
                PurchaseUpdatesResponseBuilder purchaseUpdatesResponseBuilder2 = new PurchaseUpdatesResponseBuilder();
                purchaseUpdatesResponseBuilder2.setRequestId(requestId);
                purchaseUpdatesResponseBuilder2.setRequestStatus(requestStatus);
                purchaseUpdatesResponseBuilder2.setUserData(userData);
                purchaseUpdatesResponseBuilder2.setReceipts(arrayList2);
                purchaseUpdatesResponseBuilder2.setHasMore(z);
                return purchaseUpdatesResponseBuilder2.build();
            }
            arrayList2 = arrayList;
            z = r4;
            requestId = r5;
        }
        PurchaseUpdatesResponseBuilder purchaseUpdatesResponseBuilder22 = new PurchaseUpdatesResponseBuilder();
        purchaseUpdatesResponseBuilder22.setRequestId(requestId);
        purchaseUpdatesResponseBuilder22.setRequestStatus(requestStatus);
        purchaseUpdatesResponseBuilder22.setUserData(userData);
        purchaseUpdatesResponseBuilder22.setReceipts(arrayList2);
        purchaseUpdatesResponseBuilder22.setHasMore(z);
        return purchaseUpdatesResponseBuilder22.build();
    }

    private void c(Intent intent) {
        a(d(intent));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.amazon.device.iap.internal.model.ProductDataResponseBuilder] */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.amazon.device.iap.model.RequestId] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.amazon.device.iap.model.RequestId] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r5v9 */
    private ProductDataResponse d(Intent intent) {
        LinkedHashSet linkedHashSet;
        LinkedHashSet linkedHashSet2;
        ProductDataResponse.RequestStatus requestStatus;
        ?? r1;
        ?? r5;
        LinkedHashSet linkedHashSet3;
        ?? r52;
        ProductDataResponse.RequestStatus requestStatus2 = ProductDataResponse.RequestStatus.FAILED;
        LinkedHashSet linkedHashSet4 = null;
        try {
            JSONObject jSONObject = new JSONObject(C16880lQ.LLJJIJIIJIL(intent, "itemDataOutput"));
            ?? fromString = RequestId.fromString(jSONObject.optString("requestId"));
            try {
                requestStatus = ProductDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                if (requestStatus != requestStatus2) {
                    try {
                        linkedHashSet = new LinkedHashSet();
                        try {
                            r52 = new HashMap();
                            try {
                                JSONArray optJSONArray = jSONObject.optJSONArray("unavailableSkus");
                                if (optJSONArray != null) {
                                    for (int i = 0; i < optJSONArray.length(); i++) {
                                        linkedHashSet.add(JSONArrayProtectorUtils.getString(optJSONArray, i));
                                    }
                                }
                                JSONObject optJSONObject = jSONObject.optJSONObject("items");
                                if (optJSONObject != null) {
                                    Iterator<String> keys = optJSONObject.keys();
                                    while (keys.hasNext()) {
                                        String next = keys.next();
                                        r52.put(next, a(next, optJSONObject.optJSONObject(next)));
                                    }
                                }
                                linkedHashSet4 = linkedHashSet;
                                r1 = fromString;
                                r5 = r52;
                            } catch (Exception unused) {
                                linkedHashSet4 = fromString;
                                requestStatus2 = requestStatus;
                                linkedHashSet2 = r52;
                                requestStatus = requestStatus2;
                                r1 = linkedHashSet4;
                                linkedHashSet4 = linkedHashSet;
                                r5 = linkedHashSet2;
                                ?? productDataResponseBuilder = new ProductDataResponseBuilder();
                                productDataResponseBuilder.setRequestId(r1);
                                productDataResponseBuilder.setRequestStatus(requestStatus);
                                productDataResponseBuilder.setProductData(r5);
                                productDataResponseBuilder.setUnavailableSkus(linkedHashSet4);
                                return productDataResponseBuilder.build();
                            }
                        } catch (Exception unused2) {
                            r52 = 0;
                        }
                    } catch (Exception unused3) {
                        linkedHashSet3 = null;
                        requestStatus2 = requestStatus;
                        linkedHashSet4 = fromString;
                        linkedHashSet = linkedHashSet3;
                        linkedHashSet2 = linkedHashSet3;
                        requestStatus = requestStatus2;
                        r1 = linkedHashSet4;
                        linkedHashSet4 = linkedHashSet;
                        r5 = linkedHashSet2;
                        ?? productDataResponseBuilder2 = new ProductDataResponseBuilder();
                        productDataResponseBuilder2.setRequestId(r1);
                        productDataResponseBuilder2.setRequestStatus(requestStatus);
                        productDataResponseBuilder2.setProductData(r5);
                        productDataResponseBuilder2.setUnavailableSkus(linkedHashSet4);
                        return productDataResponseBuilder2.build();
                    }
                } else {
                    r5 = 0;
                    r1 = fromString;
                }
            } catch (Exception unused4) {
                linkedHashSet3 = null;
            }
        } catch (Exception unused5) {
            linkedHashSet = null;
            linkedHashSet2 = null;
        }
        ?? productDataResponseBuilder22 = new ProductDataResponseBuilder();
        productDataResponseBuilder22.setRequestId(r1);
        productDataResponseBuilder22.setRequestStatus(requestStatus);
        productDataResponseBuilder22.setProductData(r5);
        productDataResponseBuilder22.setUnavailableSkus(linkedHashSet4);
        return productDataResponseBuilder22.build();
    }

    private void e(Intent intent) {
        JSONObject jSONObject;
        UserDataResponse f = f(intent);
        RequestId requestId = f.getRequestId();
        try {
            jSONObject = new JSONObject(C16880lQ.LLJJIJIIJIL(intent, "userInput"));
        } catch (JSONException unused) {
            jSONObject = null;
        }
        if (requestId == null || jSONObject == null) {
            a(f);
            return;
        }
        if (!jSONObject.optBoolean("isPurchaseUpdates", false)) {
            a(f);
            return;
        }
        if (f.getUserData() == null || com.amazon.device.iap.internal.util.d.a(f.getUserData().getUserId())) {
            PurchaseUpdatesResponseBuilder purchaseUpdatesResponseBuilder = new PurchaseUpdatesResponseBuilder();
            purchaseUpdatesResponseBuilder.setRequestId(requestId);
            purchaseUpdatesResponseBuilder.setRequestStatus(PurchaseUpdatesResponse.RequestStatus.FAILED);
            purchaseUpdatesResponseBuilder.setUserData(f.getUserData());
            purchaseUpdatesResponseBuilder.setReceipts(new ArrayList());
            purchaseUpdatesResponseBuilder.setHasMore(false);
            a(purchaseUpdatesResponseBuilder.build());
            return;
        }
        a(requestId.toString(), f.getUserData().getUserId(), jSONObject.optBoolean("reset", true));
    }

    private UserDataResponse f(Intent intent) {
        RequestId requestId;
        UserDataResponse.RequestStatus requestStatus = UserDataResponse.RequestStatus.FAILED;
        UserData userData = null;
        try {
            JSONObject jSONObject = new JSONObject(C16880lQ.LLJJIJIIJIL(intent, "userOutput"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
            try {
                requestStatus = UserDataResponse.RequestStatus.valueOf(jSONObject.optString("status"));
                if (requestStatus == UserDataResponse.RequestStatus.SUCCESSFUL) {
                    String optString = jSONObject.optString("userId");
                    String optString2 = jSONObject.optString("marketplace");
                    UserDataBuilder userDataBuilder = new UserDataBuilder();
                    userDataBuilder.setUserId(optString);
                    userDataBuilder.setMarketplace(optString2);
                    userData = userDataBuilder.build();
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            requestId = null;
        }
        UserDataResponseBuilder userDataResponseBuilder = new UserDataResponseBuilder();
        userDataResponseBuilder.setRequestId(requestId);
        userDataResponseBuilder.setRequestStatus(requestStatus);
        userDataResponseBuilder.setUserData(userData);
        return userDataResponseBuilder.build();
    }

    private void g(Intent intent) {
        a(h(intent));
    }

    private PurchaseResponse h(Intent intent) {
        RequestId requestId;
        UserData userData;
        PurchaseResponse.RequestStatus requestStatus = PurchaseResponse.RequestStatus.FAILED;
        Receipt receipt = null;
        try {
            JSONObject jSONObject = new JSONObject(C16880lQ.LLJJIJIIJIL(intent, "purchaseOutput"));
            requestId = RequestId.fromString(jSONObject.optString("requestId"));
            try {
                String optString = jSONObject.optString("userId");
                String optString2 = jSONObject.optString("marketplace");
                UserDataBuilder userDataBuilder = new UserDataBuilder();
                userDataBuilder.setUserId(optString);
                userDataBuilder.setMarketplace(optString2);
                userData = userDataBuilder.build();
                try {
                    requestStatus = PurchaseResponse.RequestStatus.safeValueOf(jSONObject.optString("purchaseStatus"));
                    JSONObject optJSONObject = jSONObject.optJSONObject("receipt");
                    if (optJSONObject != null) {
                        receipt = a(optJSONObject);
                    }
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                userData = null;
            }
        } catch (Exception unused3) {
            requestId = null;
            userData = null;
        }
        PurchaseResponseBuilder purchaseResponseBuilder = new PurchaseResponseBuilder();
        purchaseResponseBuilder.setRequestId(requestId);
        purchaseResponseBuilder.setRequestStatus(requestStatus);
        purchaseResponseBuilder.setUserData(userData);
        purchaseResponseBuilder.setReceipt(receipt);
        return purchaseResponseBuilder.build();
    }

    public void a(final Object obj) {
        com.amazon.device.iap.internal.util.d.a(obj, "response");
        Context b = com.amazon.device.iap.internal.d.d().b();
        final PurchasingListener a2 = com.amazon.device.iap.internal.d.d().a();
        if (b == null || a2 == null) {
            String str = a;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PurchasingListener is not set. Dropping response: ");
            LIZ.append(obj);
            e.a(str, X1D.LIZIZ(LIZ));
            return;
        }
        new Handler(b.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.iap.internal.a.c.1
            @Override // java.lang.Runnable
            public void run() {
                com_amazon_device_iap_internal_a_c$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(this);
            }

            public void com_amazon_device_iap_internal_a_c$1__run$___twin___() {
                try {
                    Object obj2 = obj;
                    if (obj2 instanceof ProductDataResponse) {
                        a2.onProductDataResponse((ProductDataResponse) obj2);
                    } else if (obj2 instanceof UserDataResponse) {
                        a2.onUserDataResponse((UserDataResponse) obj2);
                    } else if (obj2 instanceof PurchaseUpdatesResponse) {
                        a2.onPurchaseUpdatesResponse((PurchaseUpdatesResponse) obj2);
                    } else if (obj2 instanceof PurchaseResponse) {
                        a2.onPurchaseResponse((PurchaseResponse) obj2);
                    } else {
                        String str2 = c.a;
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("Unknown response type:");
                        LIZ2.append(obj.getClass().getName());
                        e.b(str2, X1D.LIZIZ(LIZ2));
                    }
                } catch (Exception e) {
                    String str3 = c.a;
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("Error in sendResponse: ");
                    LIZ3.append(e);
                    e.b(str3, X1D.LIZIZ(LIZ3));
                }
            }

            public static void com_amazon_device_iap_internal_a_c$1_com_ss_android_ugc_aweme_lancet_RunnableGuardLancet_run(AnonymousClass1 anonymousClass1) {
                boolean LIZ2;
                try {
                    anonymousClass1.com_amazon_device_iap_internal_a_c$1__run$___twin___();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    private void a(Intent intent) {
        PurchaseUpdatesResponse b = b(intent);
        if (b.getRequestStatus() == PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL) {
            com.amazon.device.iap.internal.util.b.a(b.getUserData().getUserId(), new JSONObject(C16880lQ.LLJJIJIIJIL(intent, "purchaseUpdatesOutput")).optString("offset"));
        }
        a(b);
    }

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        return intent;
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId) {
        e.a(a, "sendGetUserDataRequest");
        a(requestId.toString(), false, false);
    }

    private Product a(String str, JSONObject jSONObject) {
        ProductType valueOf = ProductType.valueOf(jSONObject.optString("itemType"));
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "priceJson");
        Currency currency = Currency.getInstance(jSONObject2.optString("currency"));
        String optString = jSONObject2.optString("value");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(currency.getSymbol());
        LIZ.append(optString);
        String LIZIZ = X1D.LIZIZ(LIZ);
        String optString2 = jSONObject.optString("title");
        String optString3 = jSONObject.optString("description");
        String optString4 = jSONObject.optString("smallIconUrl");
        int optInt = jSONObject.optInt("coinsRewardAmount", 0);
        ProductBuilder productBuilder = new ProductBuilder();
        productBuilder.setSku(str);
        productBuilder.setProductType(valueOf);
        productBuilder.setDescription(optString3);
        productBuilder.setPrice(LIZIZ);
        productBuilder.setSmallIconUrl(optString4);
        productBuilder.setTitle(optString2);
        productBuilder.setCoinsRewardAmount(optInt);
        return productBuilder.build();
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, Set<String> set) {
        e.a(a, "sendItemDataRequest");
        try {
            Context b = com.amazon.device.iap.internal.d.d().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray((Collection) set);
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", b.getPackageName());
            jSONObject.put("skus", jSONArray);
            jSONObject.put("sdkVersion", "2.0.76.4");
            bundle.putString("itemDataInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.iap.itemData");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            C16880lQ.LLLL(b, a2);
        } catch (JSONException unused) {
            e.b(a, "Error in sendItemDataRequest.");
        }
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, String str) {
        e.a(a, "sendPurchaseRequest");
        try {
            Context b = com.amazon.device.iap.internal.d.d().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sku", str);
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", b.getPackageName());
            jSONObject.put("sdkVersion", "2.0.76.4");
            bundle.putString("purchaseInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.iap.purchase");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            C16880lQ.LLLL(b, a2);
        } catch (JSONException unused) {
            e.b(a, "Error in sendPurchaseRequest.");
        }
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(Context context, Intent intent) {
        e.a(a, "handleResponse");
        intent.setComponent(new ComponentName("com.amazon.sdktestclient", "com.amazon.sdktestclient.command.CommandBroker"));
        try {
            String string = C16880lQ.LLJJIJI(intent).getString("responseType");
            if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchase")) {
                g(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.appUserId")) {
                e(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.itemData")) {
                c(intent);
            } else if (string.equalsIgnoreCase("com.amazon.testclient.iap.purchaseUpdates")) {
                a(intent);
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, boolean z) {
        if (requestId == null) {
            requestId = new RequestId();
        }
        String str = a;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sendPurchaseUpdatesRequest/sendGetUserData first:");
        LIZ.append(requestId);
        e.a(str, X1D.LIZIZ(LIZ));
        a(requestId.toString(), true, z);
    }

    @Override // com.amazon.device.iap.internal.c
    public void a(RequestId requestId, String str, FulfillmentResult fulfillmentResult) {
        e.a(a, "sendNotifyPurchaseFulfilled");
        try {
            Context b = com.amazon.device.iap.internal.d.d().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", requestId.toString());
            jSONObject.put("packageName", b.getPackageName());
            jSONObject.put("receiptId", str);
            jSONObject.put("fulfillmentResult", fulfillmentResult);
            jSONObject.put("sdkVersion", "2.0.76.4");
            bundle.putString("purchaseFulfilledInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.iap.purchaseFulfilled");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            C16880lQ.LLLL(b, a2);
        } catch (JSONException unused) {
            e.b(a, "Error in sendNotifyPurchaseFulfilled.");
        }
    }

    private void a(String str, String str2, boolean z) {
        try {
            Context b = com.amazon.device.iap.internal.d.d().b();
            String a2 = com.amazon.device.iap.internal.util.b.a(str2);
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            str.toString();
            jSONObject.put("requestId", str);
            if (z) {
                a2 = null;
            }
            jSONObject.put("offset", a2);
            jSONObject.put("sdkVersion", "2.0.76.4");
            jSONObject.put("packageName", b.getPackageName());
            bundle.putString("purchaseUpdatesInput", jSONObject.toString());
            Intent a3 = a("com.amazon.testclient.iap.purchaseUpdates");
            a3.addFlags(268435456);
            a3.putExtras(bundle);
            C16880lQ.LLLL(b, a3);
        } catch (JSONException unused) {
            e.b(a, "Error in sendPurchaseUpdatesRequest.");
        }
    }

    private void a(String str, boolean z, boolean z2) {
        try {
            Context b = com.amazon.device.iap.internal.d.d().b();
            Bundle bundle = new Bundle();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("requestId", str);
            jSONObject.put("packageName", b.getPackageName());
            jSONObject.put("sdkVersion", "2.0.76.4");
            jSONObject.put("isPurchaseUpdates", z);
            jSONObject.put("reset", z2);
            bundle.putString("userInput", jSONObject.toString());
            Intent a2 = a("com.amazon.testclient.iap.appUserId");
            a2.addFlags(268435456);
            a2.putExtras(bundle);
            C16880lQ.LLLL(b, a2);
        } catch (JSONException unused) {
            e.b(a, "Error in sendGetUserDataRequest.");
        }
    }
}
