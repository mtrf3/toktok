package com.ss.android.ugc.aweme.im.service.camera.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DMMediaAuthToken extends F9E implements Serializable {

    @InterfaceC65349Pkn("access_key_id")
    public final String accessKeyId;

    @InterfaceC65349Pkn("current_time")
    public final String currentTime;

    @InterfaceC65349Pkn("expire_time")
    public final String expireTime;

    @InterfaceC65349Pkn("secret_access_key")
    public final String secretAccessKey;

    @InterfaceC65349Pkn("session_token")
    public final String sessionToken;

    public static /* synthetic */ DMMediaAuthToken copy$default(DMMediaAuthToken dMMediaAuthToken, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dMMediaAuthToken.accessKeyId;
        }
        if ((i & 2) != 0) {
            str2 = dMMediaAuthToken.sessionToken;
        }
        if ((i & 4) != 0) {
            str3 = dMMediaAuthToken.secretAccessKey;
        }
        if ((i & 8) != 0) {
            str4 = dMMediaAuthToken.expireTime;
        }
        if ((i & 16) != 0) {
            str5 = dMMediaAuthToken.currentTime;
        }
        return dMMediaAuthToken.copy(str, str2, str3, str4, str5);
    }

    public final DMMediaAuthToken copy(String accessKeyId, String sessionToken, String secretAccessKey, String expireTime, String currentTime) {
        o.LJIIIZ(accessKeyId, "accessKeyId");
        o.LJIIIZ(sessionToken, "sessionToken");
        o.LJIIIZ(secretAccessKey, "secretAccessKey");
        o.LJIIIZ(expireTime, "expireTime");
        o.LJIIIZ(currentTime, "currentTime");
        return new DMMediaAuthToken(accessKeyId, sessionToken, secretAccessKey, expireTime, currentTime);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.accessKeyId, this.sessionToken, this.secretAccessKey, this.expireTime, this.currentTime};
    }

    public final String getAccessKeyId() {
        return this.accessKeyId;
    }

    public final String getCurrentTime() {
        return this.currentTime;
    }

    public final String getExpireTime() {
        return this.expireTime;
    }

    public final String getSecretAccessKey() {
        return this.secretAccessKey;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public DMMediaAuthToken(String accessKeyId, String sessionToken, String secretAccessKey, String expireTime, String currentTime) {
        o.LJIIIZ(accessKeyId, "accessKeyId");
        o.LJIIIZ(sessionToken, "sessionToken");
        o.LJIIIZ(secretAccessKey, "secretAccessKey");
        o.LJIIIZ(expireTime, "expireTime");
        o.LJIIIZ(currentTime, "currentTime");
        this.accessKeyId = accessKeyId;
        this.sessionToken = sessionToken;
        this.secretAccessKey = secretAccessKey;
        this.expireTime = expireTime;
        this.currentTime = currentTime;
    }
}
