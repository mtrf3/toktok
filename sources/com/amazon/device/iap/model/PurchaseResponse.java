package com.amazon.device.iap.model;

import X.C16880lQ;
import X.V0N;
import com.amazon.device.iap.internal.model.PurchaseResponseBuilder;
import com.amazon.device.iap.internal.util.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class PurchaseResponse {
    public final Receipt receipt;
    public final RequestId requestId;
    public final RequestStatus requestStatus;
    public final UserData userData;

    public String toString() {
        String str;
        Object[] objArr = new Object[5];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        RequestStatus requestStatus = this.requestStatus;
        if (requestStatus != null) {
            str = requestStatus.toString();
        } else {
            str = "null";
        }
        objArr[2] = str;
        objArr[3] = this.userData;
        objArr[4] = this.receipt;
        return C16880lQ.LLLZ("(%s, requestId: \"%s\", purchaseRequestStatus: \"%s\", userId: \"%s\", receipt: %s)", objArr);
    }

    public JSONObject toJSON() {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestId", this.requestId);
        jSONObject.put("requestStatus", this.requestStatus);
        UserData userData = this.userData;
        Object obj2 = "";
        if (userData == null) {
            obj = "";
        } else {
            obj = userData.toJSON();
        }
        jSONObject.put("userData", obj);
        if (getReceipt() != null) {
            obj2 = getReceipt().toJSON();
        }
        jSONObject.put("receipt", obj2);
        return jSONObject;
    }

    public Receipt getReceipt() {
        return this.receipt;
    }

    public RequestId getRequestId() {
        return this.requestId;
    }

    public RequestStatus getRequestStatus() {
        return this.requestStatus;
    }

    public UserData getUserData() {
        return this.userData;
    }

    /* loaded from: classes.dex */
    public enum RequestStatus {
        SUCCESSFUL,
        FAILED,
        INVALID_SKU,
        ALREADY_PURCHASED,
        NOT_SUPPORTED;

        public static RequestStatus safeValueOf(String str) {
            if (d.a(str)) {
                return null;
            }
            if ("ALREADY_ENTITLED".equalsIgnoreCase(str)) {
                return ALREADY_PURCHASED;
            }
            return valueOf(str.toUpperCase());
        }

        public static RequestStatus valueOf(String str) {
            return (RequestStatus) V0N.LJJJ(RequestStatus.class, str);
        }
    }

    public PurchaseResponse(PurchaseResponseBuilder purchaseResponseBuilder) {
        d.a(purchaseResponseBuilder.getRequestId(), "requestId");
        d.a(purchaseResponseBuilder.getRequestStatus(), "requestStatus");
        if (purchaseResponseBuilder.getRequestStatus() == RequestStatus.SUCCESSFUL) {
            d.a(purchaseResponseBuilder.getReceipt(), "receipt");
            d.a(purchaseResponseBuilder.getUserData(), "userData");
        }
        this.requestId = purchaseResponseBuilder.getRequestId();
        this.userData = purchaseResponseBuilder.getUserData();
        this.receipt = purchaseResponseBuilder.getReceipt();
        this.requestStatus = purchaseResponseBuilder.getRequestStatus();
    }
}
