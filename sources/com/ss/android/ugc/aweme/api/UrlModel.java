package com.ss.android.ugc.aweme.api;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.s0;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UrlModel implements Serializable {

    @InterfaceC65349Pkn("height")
    public final Integer height;

    @InterfaceC65349Pkn("uri")
    public final String uri;

    @InterfaceC65349Pkn("url_list")
    public final List<String> urlList;

    @InterfaceC65349Pkn("width")
    public final Integer width;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UrlModel copy$default(UrlModel urlModel, String str, List list, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = urlModel.uri;
        }
        if ((i & 2) != 0) {
            list = urlModel.urlList;
        }
        if ((i & 4) != 0) {
            num = urlModel.width;
        }
        if ((i & 8) != 0) {
            num2 = urlModel.height;
        }
        return urlModel.copy(str, list, num, num2);
    }

    public final UrlModel copy(String str, List<String> list, Integer num, Integer num2) {
        return new UrlModel(str, list, num, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        return o.LJ(this.uri, urlModel.uri) && o.LJ(this.urlList, urlModel.urlList) && o.LJ(this.width, urlModel.width) && o.LJ(this.height, urlModel.height);
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.width;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.height;
        return hashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlModel(uri=");
        LIZ.append(this.uri);
        LIZ.append(", urlList=");
        LIZ.append(this.urlList);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        return s0.LIZJ(LIZ, this.height, ')', LIZ);
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public UrlModel(String str, List<String> list, Integer num, Integer num2) {
        this.uri = str;
        this.urlList = list;
        this.width = num;
        this.height = num2;
    }
}
