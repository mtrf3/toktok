package com.amazon.device.iap.model;

import X.C16880lQ;
import X.V0N;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.util.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class PurchaseUpdatesResponse {
    public final boolean hasMore;
    public final List<Receipt> receipts;
    public final RequestId requestId;
    public final RequestStatus requestStatus;
    public final UserData userData;

    public String toString() {
        String str;
        Object[] objArr = new Object[6];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        objArr[2] = this.requestStatus;
        objArr[3] = this.userData;
        List<Receipt> list = this.receipts;
        if (list != null) {
            str = Arrays.toString(list.toArray());
        } else {
            str = "null";
        }
        objArr[4] = str;
        objArr[5] = Boolean.valueOf(this.hasMore);
        return C16880lQ.LLLZ("(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\", receipts: %s, hasMore: \"%b\")", objArr);
    }

    public JSONObject toJSON() {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("REQUEST_ID", this.requestId);
        jSONObject.put("REQUEST_STATUS", this.requestStatus);
        UserData userData = this.userData;
        if (userData != null) {
            obj = userData.toJSON();
        } else {
            obj = "";
        }
        jSONObject.put("USER_DATA", obj);
        JSONArray jSONArray = new JSONArray();
        List<Receipt> list = this.receipts;
        if (list != null) {
            Iterator<Receipt> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().toJSON());
            }
        }
        jSONObject.put("RECEIPTS", jSONArray);
        jSONObject.put("HAS_MORE", this.hasMore);
        return jSONObject;
    }

    public List<Receipt> getReceipts() {
        return this.receipts;
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

    public boolean hasMore() {
        return this.hasMore;
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

    public PurchaseUpdatesResponse(PurchaseUpdatesResponseBuilder purchaseUpdatesResponseBuilder) {
        List<Receipt> receipts;
        d.a(purchaseUpdatesResponseBuilder.getRequestId(), "requestId");
        d.a(purchaseUpdatesResponseBuilder.getRequestStatus(), "requestStatus");
        if (RequestStatus.SUCCESSFUL == purchaseUpdatesResponseBuilder.getRequestStatus()) {
            d.a(purchaseUpdatesResponseBuilder.getUserData(), "userData");
            d.a((Object) purchaseUpdatesResponseBuilder.getReceipts(), "receipts");
        }
        this.requestId = purchaseUpdatesResponseBuilder.getRequestId();
        this.requestStatus = purchaseUpdatesResponseBuilder.getRequestStatus();
        this.userData = purchaseUpdatesResponseBuilder.getUserData();
        if (purchaseUpdatesResponseBuilder.getReceipts() == null) {
            receipts = new ArrayList<>();
        } else {
            receipts = purchaseUpdatesResponseBuilder.getReceipts();
        }
        this.receipts = receipts;
        this.hasMore = purchaseUpdatesResponseBuilder.hasMore();
    }
}
