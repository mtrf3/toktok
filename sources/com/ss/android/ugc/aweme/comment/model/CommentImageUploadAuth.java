package com.ss.android.ugc.aweme.comment.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes13.dex */
public final class CommentImageUploadAuth implements Serializable {

    @InterfaceC65349Pkn("expired_time")
    public long expiredTime;

    @InterfaceC65349Pkn("access_key")
    public String accessKey = "";

    @InterfaceC65349Pkn("secret_key")
    public String secretKey = "";

    @InterfaceC65349Pkn("session_token")
    public String sessionToken = "";

    @InterfaceC65349Pkn("service_id")
    public String serviceId = "";

    @InterfaceC65349Pkn("upload_domain")
    public String uploadDomain = "";

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final long getExpiredTime() {
        return this.expiredTime;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getServiceId() {
        return this.serviceId;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final String getUploadDomain() {
        return this.uploadDomain;
    }

    public final void setAccessKey(String str) {
        this.accessKey = str;
    }

    public final void setExpiredTime(long j) {
        this.expiredTime = j;
    }

    public final void setSecretKey(String str) {
        this.secretKey = str;
    }

    public final void setServiceId(String str) {
        this.serviceId = str;
    }

    public final void setSessionToken(String str) {
        this.sessionToken = str;
    }

    public final void setUploadDomain(String str) {
        this.uploadDomain = str;
    }
}
