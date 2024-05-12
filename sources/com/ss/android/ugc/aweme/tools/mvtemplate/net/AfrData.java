package com.ss.android.ugc.aweme.tools.mvtemplate.net;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class AfrData {
    public String algorithm = "";

    @InterfaceC65349Pkn("pic_conf")
    public String jsonResult = "";
    public String pic;

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getJsonResult() {
        return this.jsonResult;
    }

    public final String getPic() {
        return this.pic;
    }

    public final void setAlgorithm(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.algorithm = str;
    }

    public final void setJsonResult(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.jsonResult = str;
    }

    public final void setPic(String str) {
        this.pic = str;
    }
}
