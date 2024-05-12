package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes5.dex */
public class VideoAuth {

    @InterfaceC65349Pkn("auth")
    public String auth;

    @InterfaceC65349Pkn("code")
    public String code;

    public String getAuth() {
        String str = this.auth;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }

    public String getCode() {
        String str = this.code;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
