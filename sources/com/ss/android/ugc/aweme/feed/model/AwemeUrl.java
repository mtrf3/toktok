package com.ss.android.ugc.aweme.feed.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class AwemeUrl implements Serializable {

    @InterfaceC65349Pkn("uri")
    public final String uri;

    @InterfaceC65349Pkn("url_list")
    public final List<String> urlList;

    /* JADX WARN: Multi-variable type inference failed */
    public AwemeUrl() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AwemeUrl copy$default(AwemeUrl awemeUrl, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = awemeUrl.urlList;
        }
        if ((i & 2) != 0) {
            str = awemeUrl.uri;
        }
        return awemeUrl.copy(list, str);
    }

    public final AwemeUrl copy(List<String> urlList, String str) {
        o.LJIIIZ(urlList, "urlList");
        return new AwemeUrl(urlList, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeUrl)) {
            return false;
        }
        AwemeUrl awemeUrl = (AwemeUrl) obj;
        return o.LJ(this.urlList, awemeUrl.urlList) && o.LJ(this.uri, awemeUrl.uri);
    }

    public int hashCode() {
        int hashCode = this.urlList.hashCode() * 31;
        String str = this.uri;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AwemeUrl(urlList=");
        LIZ.append(this.urlList);
        LIZ.append(", uri=");
        return q.LIZIZ(LIZ, this.uri, ')', LIZ);
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public AwemeUrl(List<String> urlList, String str) {
        o.LJIIIZ(urlList, "urlList");
        this.urlList = urlList;
        this.uri = str;
    }

    public /* synthetic */ AwemeUrl(List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str);
    }
}
