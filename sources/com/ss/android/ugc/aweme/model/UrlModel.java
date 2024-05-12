package com.ss.android.ugc.aweme.model;

import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import defpackage.q;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class UrlModel extends BaseResponse implements Serializable {

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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UrlModel copy$default(UrlModel urlModel, String str, List list, int i, int i2, String str2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = urlModel.uri;
        }
        if ((i3 & 2) != 0) {
            list = urlModel.urlList;
        }
        if ((i3 & 4) != 0) {
            i = urlModel.width;
        }
        if ((i3 & 8) != 0) {
            i2 = urlModel.height;
        }
        if ((i3 & 16) != 0) {
            str2 = urlModel.urlKey;
        }
        return urlModel.copy(str, list, i, i2, str2);
    }

    public final UrlModel copy(String str, List<String> list, int i, int i2, String urlKey) {
        o.LJIIIZ(urlKey, "urlKey");
        return new UrlModel(str, list, i, i2, urlKey);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UrlModel)) {
            return false;
        }
        UrlModel urlModel = (UrlModel) obj;
        return o.LJ(this.uri, urlModel.uri) && o.LJ(this.urlList, urlModel.urlList) && this.width == urlModel.width && this.height == urlModel.height && o.LJ(this.urlKey, urlModel.urlKey);
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        return this.urlKey.hashCode() + ((((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.width) * 31) + this.height) * 31);
    }

    @Override // com.ss.android.ugc.aweme.base.api.BaseResponse
    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("UrlModel(uri=");
        LIZ.append(this.uri);
        LIZ.append(", urlList=");
        LIZ.append(this.urlList);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", urlKey=");
        return q.LIZIZ(LIZ, this.urlKey, ')', LIZ);
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getUri() {
        return this.uri;
    }

    public final String getUrlKey() {
        return this.urlKey;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final int getWidth() {
        return this.width;
    }

    public UrlModel(String str, List<String> list, int i, int i2, String urlKey) {
        o.LJIIIZ(urlKey, "urlKey");
        this.uri = str;
        this.urlList = list;
        this.width = i;
        this.height = i2;
        this.urlKey = urlKey;
    }

    public /* synthetic */ UrlModel(String str, List list, int i, int i2, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? "" : str2);
    }
}
