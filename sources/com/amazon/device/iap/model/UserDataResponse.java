package com.amazon.device.iap.model;

import X.C16880lQ;
import X.V0N;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.internal.util.d;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class UserDataResponse {
    public final RequestId requestId;
    public final RequestStatus requestStatus;
    public final UserData userData;

    public String toString() {
        String str;
        Object[] objArr = new Object[4];
        objArr[0] = super.toString();
        objArr[1] = this.requestId;
        RequestStatus requestStatus = this.requestStatus;
        String str2 = "null";
        if (requestStatus == null) {
            str = "null";
        } else {
            str = requestStatus.toString();
        }
        objArr[2] = str;
        UserData userData = this.userData;
        if (userData != null) {
            str2 = userData.toString();
        }
        objArr[3] = str2;
        return C16880lQ.LLLZ("(%s, requestId: \"%s\", requestStatus: \"%s\", userData: \"%s\")", objArr);
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
        return jSONObject;
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
        NOT_SUPPORTED;

        public static RequestStatus valueOf(String str) {
            return (RequestStatus) V0N.LJJJ(RequestStatus.class, str);
        }
    }

    public UserDataResponse(UserDataResponseBuilder userDataResponseBuilder) {
        d.a(userDataResponseBuilder.getRequestId(), "requestId");
        d.a(userDataResponseBuilder.getRequestStatus(), "requestStatus");
        this.requestId = userDataResponseBuilder.getRequestId();
        this.requestStatus = userDataResponseBuilder.getRequestStatus();
        this.userData = userDataResponseBuilder.getUserData();
    }
}
