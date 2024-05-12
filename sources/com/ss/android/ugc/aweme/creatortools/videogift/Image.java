package com.ss.android.ugc.aweme.creatortools.videogift;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Image {

    @InterfaceC65349Pkn("uri")
    public final String uri;

    @InterfaceC65349Pkn("url_list")
    public final List<String> urlList;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image image = (Image) obj;
        return o.LJ(this.uri, image.uri) && o.LJ(this.urlList, image.urlList);
    }

    public final int hashCode() {
        String str = this.uri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<String> list = this.urlList;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Image(uri=");
        LIZ.append(this.uri);
        LIZ.append(", urlList=");
        return C1NE.LIZIZ(LIZ, this.urlList, ')', LIZ);
    }

    public Image(String str, List<String> list) {
        this.uri = str;
        this.urlList = list;
    }
}
