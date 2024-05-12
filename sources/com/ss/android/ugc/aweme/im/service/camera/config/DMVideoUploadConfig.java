package com.ss.android.ugc.aweme.im.service.camera.config;

import X.F9E;
import X.InterfaceC65349Pkn;
import java.io.Serializable;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class DMVideoUploadConfig extends F9E implements Serializable {

    @InterfaceC65349Pkn("auth_token")
    public final DMMediaAuthToken authToken;

    @InterfaceC65349Pkn("host")
    public final String host;

    @InterfaceC65349Pkn("space_name")
    public final String spaceName;

    public static /* synthetic */ DMVideoUploadConfig copy$default(DMVideoUploadConfig dMVideoUploadConfig, String str, String str2, DMMediaAuthToken dMMediaAuthToken, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dMVideoUploadConfig.spaceName;
        }
        if ((i & 2) != 0) {
            str2 = dMVideoUploadConfig.host;
        }
        if ((i & 4) != 0) {
            dMMediaAuthToken = dMVideoUploadConfig.authToken;
        }
        return dMVideoUploadConfig.copy(str, str2, dMMediaAuthToken);
    }

    public final DMVideoUploadConfig copy(String spaceName, String host, DMMediaAuthToken authToken) {
        o.LJIIIZ(spaceName, "spaceName");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(authToken, "authToken");
        return new DMVideoUploadConfig(spaceName, host, authToken);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.spaceName, this.host, this.authToken};
    }

    public final DMMediaAuthToken getAuthToken() {
        return this.authToken;
    }

    public final String getHost() {
        return this.host;
    }

    public final String getSpaceName() {
        return this.spaceName;
    }

    public DMVideoUploadConfig(String spaceName, String host, DMMediaAuthToken authToken) {
        o.LJIIIZ(spaceName, "spaceName");
        o.LJIIIZ(host, "host");
        o.LJIIIZ(authToken, "authToken");
        this.spaceName = spaceName;
        this.host = host;
        this.authToken = authToken;
    }
}
