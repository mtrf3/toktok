package com.ss.android.ugc.aweme.global.config.settings.pojo;

import X.C158056If;
import X.InterfaceC65349Pkn;

/* loaded from: classes10.dex */
public class UgLoginBanner {

    @InterfaceC65349Pkn("resource_url")
    public UrlModel resourceUrl;

    @InterfaceC65349Pkn("text")
    public String text;

    public UrlModel getResourceUrl() {
        UrlModel urlModel = this.resourceUrl;
        if (urlModel != null) {
            return urlModel;
        }
        throw new C158056If();
    }

    public String getText() {
        String str = this.text;
        if (str != null) {
            return str;
        }
        throw new C158056If();
    }
}
