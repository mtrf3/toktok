package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class EncryptedVideoContent implements Serializable {

    @InterfaceC65349Pkn("skey")
    public String secretKey;

    @InterfaceC65349Pkn("md5")
    public String sourceMD5;

    @InterfaceC65349Pkn("tkey")
    public String tosKey;

    public final String getSecretKey() {
        return this.secretKey;
    }

    public final String getSourceMD5() {
        return this.sourceMD5;
    }

    public final String getTosKey() {
        return this.tosKey;
    }

    public final void setSecretKey(String str) {
        this.secretKey = str;
    }

    public final void setSourceMD5(String str) {
        this.sourceMD5 = str;
    }

    public final void setTosKey(String str) {
        this.tosKey = str;
    }
}
