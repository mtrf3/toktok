package com.ss.android.ugc.aweme.feed.model.search;

import X.InterfaceC65349Pkn;
import java.io.Serializable;

/* loaded from: classes7.dex */
public final class SearchShopStruct implements Serializable {

    @InterfaceC65349Pkn("height")
    public int height;

    @InterfaceC65349Pkn("rawData")
    public String rawData;

    @InterfaceC65349Pkn("scheme")
    public String scheme;

    public final int getHeight() {
        return this.height;
    }

    public final String getRawData() {
        return this.rawData;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setRawData(String str) {
        this.rawData = str;
    }

    public final void setScheme(String str) {
        this.scheme = str;
    }
}
