package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes9.dex */
public final class UrlPackage implements Serializable {

    @InterfaceC65349Pkn("Android")
    public String androidUrl;

    @InterfaceC65349Pkn("iOS")
    public String iosUrl;

    public final String getAndroidUrl() {
        return this.androidUrl;
    }

    public final String getIosUrl() {
        return this.iosUrl;
    }

    public final void setAndroidUrl(String str) {
        this.androidUrl = str;
    }

    public final void setIosUrl(String str) {
        this.iosUrl = str;
    }
}
