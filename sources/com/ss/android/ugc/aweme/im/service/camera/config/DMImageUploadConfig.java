package com.ss.android.ugc.aweme.im.service.camera.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DMImageUploadConfig extends F9E implements Serializable {

    @InterfaceC65349Pkn("auth_token")
    public final DMMediaAuthToken authToken;

    @InterfaceC65349Pkn("host")
    public final String host;

    @InterfaceC65349Pkn("service_id")
    public final String service_id;

    public static /* synthetic */ DMImageUploadConfig copy$default(DMImageUploadConfig dMImageUploadConfig, String str, String str2, DMMediaAuthToken dMMediaAuthToken, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dMImageUploadConfig.service_id;
        }
        if ((i & 2) != 0) {
            str2 = dMImageUploadConfig.host;
        }
        if ((i & 4) != 0) {
            dMMediaAuthToken = dMImageUploadConfig.authToken;
        }
        return dMImageUploadConfig.copy(str, str2, dMMediaAuthToken);
    }

    public final DMImageUploadConfig copy(String service_id, String host, DMMediaAuthToken authToken) {
        o.LJIIIZ(service_id, "service_id");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(authToken, "authToken");
        return new DMImageUploadConfig(service_id, host, authToken);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.service_id, this.host, this.authToken};
    }

    public final DMMediaAuthToken getAuthToken() {
        return this.authToken;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getService_id() {
        return this.service_id;
    }

    public DMImageUploadConfig(String service_id, String host, DMMediaAuthToken authToken) {
        o.LJIIIZ(service_id, "service_id");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(authToken, "authToken");
        this.service_id = service_id;
        this.host = host;
        this.authToken = authToken;
    }
}
