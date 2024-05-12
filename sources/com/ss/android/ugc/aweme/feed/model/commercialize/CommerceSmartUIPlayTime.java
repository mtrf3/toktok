package com.ss.android.ugc.aweme.feed.model.commercialize;

import X.InterfaceC65349Pkn;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes9.dex */
public final class CommerceSmartUIPlayTime implements Serializable {

    @InterfaceC65349Pkn("package")
    public UrlPackage packageUrl;

    @InterfaceC65349Pkn("params")
    public List<Integer> params;

    public final UrlPackage getPackageUrl() {
        return this.packageUrl;
    }

    public final List<Integer> getParams() {
        return this.params;
    }

    public final void setPackageUrl(UrlPackage urlPackage) {
        this.packageUrl = urlPackage;
    }

    public final void setParams(List<Integer> list) {
        this.params = list;
    }
}
