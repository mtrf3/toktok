package com.ss.android.ugc.aweme.specialplus;

import X.InterfaceC65349Pkn;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class SpecialPlusMedia {

    @InterfaceC65349Pkn("url")
    public String url = "";

    @InterfaceC65349Pkn("md5")
    public String md5 = "";

    public final String getMd5() {
        return this.md5;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setMd5(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.md5 = str;
    }

    public final void setUrl(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.url = str;
    }
}
