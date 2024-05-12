package com.amazon.device.iap.internal.b.c;

import X.C16880lQ;
import X.C25620zW;
import X.X1D;
import com.amazon.device.iap.internal.model.ProductBuilder;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.util.e;
import com.amazon.device.iap.model.Product;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.ProductType;
import com.amazon.venezia.command.SuccessResult;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import defpackage.i0;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class b extends c {
    public static final String b = C16880lQ.LJLLJ(b.class);

    @Override // com.amazon.device.iap.internal.b.i
    public boolean a(SuccessResult successResult) {
        Map data = successResult.getData();
        String str = b;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("data: ");
        LIZ.append(data);
        e.a(str, X1D.LIZIZ(LIZ));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashMap hashMap = new HashMap();
        for (String str2 : this.a) {
            if (!data.containsKey(str2)) {
                linkedHashSet.add(str2);
            } else {
                try {
                    hashMap.put(str2, a(str2, data));
                } catch (IllegalArgumentException e) {
                    linkedHashSet.add(str2);
                    String str3 = b;
                    StringBuilder LIZIZ = C25620zW.LIZIZ("Error parsing JSON for SKU ", str2, ": ");
                    LIZIZ.append(e.getMessage());
                    e.b(str3, X1D.LIZIZ(LIZIZ));
                }
            }
        }
        com.amazon.device.iap.internal.b.e b2 = b();
        ProductDataResponseBuilder productDataResponseBuilder = new ProductDataResponseBuilder();
        productDataResponseBuilder.setRequestId(b2.c());
        productDataResponseBuilder.setRequestStatus(ProductDataResponse.RequestStatus.SUCCESSFUL);
        productDataResponseBuilder.setUnavailableSkus(linkedHashSet);
        productDataResponseBuilder.setProductData(hashMap);
        b2.d().a(productDataResponseBuilder.build());
        return true;
    }

    public b(com.amazon.device.iap.internal.b.e eVar, Set<String> set) {
        super(eVar, "1.0", set);
    }

    private Product a(String str, Map map) {
        String str2 = (String) map.get(str);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            ProductType valueOf = ProductType.valueOf(JSONObjectProtectorUtils.getString(jSONObject, "itemType").toUpperCase());
            String string = JSONObjectProtectorUtils.getString(jSONObject, "description");
            String optString = jSONObject.optString("price");
            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "title");
            String string3 = JSONObjectProtectorUtils.getString(jSONObject, "iconUrl");
            int optInt = jSONObject.optInt("coinsRewardAmount", 0);
            ProductBuilder productBuilder = new ProductBuilder();
            productBuilder.setSku(str);
            productBuilder.setProductType(valueOf);
            productBuilder.setDescription(string);
            productBuilder.setPrice(optString);
            productBuilder.setSmallIconUrl(string3);
            productBuilder.setTitle(string2);
            productBuilder.setCoinsRewardAmount(optInt);
            return productBuilder.build();
        } catch (JSONException unused) {
            throw new IllegalArgumentException(i0.LJFF("error in parsing json string", str2));
        }
    }
}
