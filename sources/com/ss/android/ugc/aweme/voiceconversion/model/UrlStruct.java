package com.ss.android.ugc.aweme.voiceconversion.model;

import X.C61878OQg;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UrlStruct extends F9E {

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC65349Pkn("uri")
    public final String uri;

    @InterfaceC65349Pkn("url_key")
    public final String urlKey;

    @InterfaceC65349Pkn("url_list")
    public final List<String> urlList;

    @InterfaceC65349Pkn("width")
    public final int width;

    public UrlStruct() {
        this(null, null, 0, 0, null, 31, null);
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.uri, this.urlList, Integer.valueOf(this.width), Integer.valueOf(this.height), this.urlKey};
    }

    public UrlStruct(String uri, List<String> urlList, int i, int i2, String urlKey) {
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(urlList, "urlList");
        o.LJIIIZ(urlKey, "urlKey");
        this.uri = uri;
        this.urlList = urlList;
        this.width = i;
        this.height = i2;
        this.urlKey = urlKey;
    }

    public UrlStruct(String str, List list, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? C61878OQg.INSTANCE : list, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) == 0 ? str2 : "");
    }
}
