package com.ss.android.ugc.aweme.publish.model;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class CloudEditUploadAuthConfig {

    @InterfaceC65349Pkn("access_key_id")
    public final String accessKeyId;

    @InterfaceC65349Pkn("application")
    public final String application;

    @InterfaceC65349Pkn("current_time")
    public final String currentTime;

    @InterfaceC65349Pkn("expired_time")
    public final String expireTime;

    @InterfaceC65349Pkn("host")
    public final String host;

    @InterfaceC65349Pkn("secret_access_key")
    public final String secretAccessKey;

    @InterfaceC65349Pkn("session_token")
    public final String sessionToken;

    @InterfaceC65349Pkn("uploader")
    public final String uploader;

    @InterfaceC65349Pkn("user")
    public final String user;

    /* JADX WARN: Multi-variable type inference failed */
    public CloudEditUploadAuthConfig() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 511, 0 == true ? 1 : 0);
    }

    public CloudEditUploadAuthConfig(String accessKeyId, String secretAccessKey, String sessionToken, String expireTime, String currentTime, String host, String user, String uploader, String application) {
        o.LJIIIZ(accessKeyId, "accessKeyId");
        o.LJIIIZ(secretAccessKey, "secretAccessKey");
        o.LJIIIZ(sessionToken, "sessionToken");
        o.LJIIIZ(expireTime, "expireTime");
        o.LJIIIZ(currentTime, "currentTime");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(user, "user");
        o.LJIIIZ(uploader, "uploader");
        o.LJIIIZ(application, "application");
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
        this.sessionToken = sessionToken;
        this.expireTime = expireTime;
        this.currentTime = currentTime;
        this.host = host;
        this.user = user;
        this.uploader = uploader;
        this.application = application;
    }

    public /* synthetic */ CloudEditUploadAuthConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) == 0 ? str9 : "");
    }
}
