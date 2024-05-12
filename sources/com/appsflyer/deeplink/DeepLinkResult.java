package com.appsflyer.deeplink;

import X.V0N;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class DeepLinkResult {
    public final DeepLink deepLink;
    public final Error error;
    public final Status status;

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("deepLink", this.deepLink);
            jSONObject.put("error", this.error);
            jSONObject.put("status", this.status);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    public Error getError() {
        return this.error;
    }

    public Status getStatus() {
        return this.status;
    }

    /* loaded from: classes.dex */
    public enum Error {
        TIMEOUT,
        NETWORK,
        HTTP_STATUS_CODE,
        UNEXPECTED,
        DEVELOPER_ERROR;

        public static Error valueOf(String str) {
            return (Error) V0N.LJJJ(Error.class, str);
        }
    }

    /* loaded from: classes.dex */
    public enum Status {
        FOUND,
        NOT_FOUND,
        ERROR;

        public static Status valueOf(String str) {
            return (Status) V0N.LJJJ(Status.class, str);
        }
    }

    public DeepLinkResult(DeepLink deepLink, Error error) {
        this.deepLink = deepLink;
        this.error = error;
        if (error != null) {
            this.status = Status.ERROR;
        } else if (deepLink != null) {
            this.status = Status.FOUND;
        } else {
            this.status = Status.NOT_FOUND;
        }
    }
}
