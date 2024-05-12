package com.bytedance.libcore.datastore;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GenUploadInfoRes {

    @InterfaceC65349Pkn("status_code")
    public int code;

    @InterfaceC65349Pkn("message")
    public String message = "";

    @InterfaceC65349Pkn("access_key")
    public String accessKey = "";

    @InterfaceC65349Pkn("secret_access_key")
    public String secretKey = "";

    @InterfaceC65349Pkn("space_name")
    public String spaceName = "";

    @InterfaceC65349Pkn("session_token")
    public String session = "";

    @InterfaceC65349Pkn("domain")
    public String domain = "";

    public final String getAccessKey() {
        return this.accessKey;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getSession() {
        return this.session;
    }

    public final String getSpaceName() {
        return this.spaceName;
    }

    public final void setAccessKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.accessKey = str;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setDomain(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.domain = str;
    }

    public final void setMessage(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.message = str;
    }

    public final void setSecretKey(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.secretKey = str;
    }

    public final void setSession(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.session = str;
    }

    public final void setSpaceName(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.spaceName = str;
    }
}
