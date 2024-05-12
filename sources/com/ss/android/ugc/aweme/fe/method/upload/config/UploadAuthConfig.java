package com.ss.android.ugc.aweme.fe.method.upload.config;

import X.AbstractC36908Ee8;
import X.InterfaceC195777mH;
import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class UploadAuthConfig extends AbstractC36908Ee8 {

    @InterfaceC195777mH
    @InterfaceC65349Pkn("code")
    public int code;

    @InterfaceC65349Pkn("data")
    public UploadConfig config;

    @InterfaceC195777mH
    @InterfaceC65349Pkn("message")
    public String message = "";

    public final int getCode() {
        return this.code;
    }

    public final UploadConfig getConfig() {
        return this.config;
    }

    public final String getMessage() {
        return this.message;
    }

    public final UploadConfig getUploadConfig() {
        return this.config;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setConfig(UploadConfig uploadConfig) {
        this.config = uploadConfig;
    }

    public final void setMessage(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.message = str;
    }
}
