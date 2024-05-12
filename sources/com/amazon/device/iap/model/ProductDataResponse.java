package com.amazon.device.iap.model;

import X.C16880lQ;
import X.V0N;
import com.amazon.device.iap.internal.model.ProductDataResponseBuilder;
import com.amazon.device.iap.internal.util.d;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class ProductDataResponse {
    public final Map<String, Product> productData;
    public final RequestId requestId;
    public final RequestStatus requestStatus;
    public final Set<String> unavailableSkus;

    public String toString() {
        String str;
        String str2;
        Object[] objArr = new Object[5];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        Set<String> set = this.unavailableSkus;
        String str3 = "null";
        if (set == null) {
            str = "null";
        } else {
            str = set.toString();
        }
        objArr[2] = str;
        RequestStatus requestStatus = this.requestStatus;
        if (requestStatus == null) {
            str2 = "null";
        } else {
            str2 = requestStatus.toString();
        }
        objArr[3] = str2;
        Map<String, Product> map = this.productData;
        if (map != null) {
            str3 = map.toString();
        }
        objArr[4] = str3;
        return C16880lQ.LLLZ("(%s, requestId: \"%s\", unavailableSkus: %s, requestStatus: \"%s\", productData: %s)", objArr);
    }

    public JSONObject toJSON() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestId", this.requestId);
        jSONObject.put("UNAVAILABLE_SKUS", this.unavailableSkus);
        jSONObject.put("requestStatus", this.requestStatus);
        JSONObject jSONObject2 = new JSONObject();
        Map<String, Product> map = this.productData;
        if (map != null) {
            for (String str : map.keySet()) {
                jSONObject2.put(str, this.productData.get(str).toJSON());
            }
        }
        jSONObject.put("productData", jSONObject2);
        return jSONObject;
    }

    public Map<String, Product> getProductData() {
        return this.productData;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public Set<String> getUnavailableSkus() {
        return this.unavailableSkus;
    }

    /* loaded from: classes.dex */
    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        NOT_SUPPORTED;

        public static RequestStatus valueOf(String str) {
            return (RequestStatus) V0N.LJJJ(RequestStatus.class, str);
        }
    }

    public ProductDataResponse(ProductDataResponseBuilder productDataResponseBuilder) {
        d.a(productDataResponseBuilder.getRequestId(), "requestId");
        d.a(productDataResponseBuilder.getRequestStatus(), "requestStatus");
        if (productDataResponseBuilder.getUnavailableSkus() == null) {
            productDataResponseBuilder.setUnavailableSkus(new HashSet());
        }
        if (RequestStatus.SUCCESSFUL == productDataResponseBuilder.getRequestStatus()) {
            d.a(productDataResponseBuilder.getProductData(), "productData");
        } else {
            productDataResponseBuilder.setProductData(new HashMap());
        }
        this.requestId = productDataResponseBuilder.getRequestId();
        this.requestStatus = productDataResponseBuilder.getRequestStatus();
        this.unavailableSkus = productDataResponseBuilder.getUnavailableSkus();
        this.productData = productDataResponseBuilder.getProductData();
    }
}
