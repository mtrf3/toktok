package com.ss.android.ugc.aweme.ecommerce.base.cart;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class Image {

    @InterfaceC65349Pkn("url_list")
    public final List<String> urlList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Image copy$default(Image image, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = image.urlList;
        }
        return image.copy(list);
    }

    public final Image copy(List<String> list) {
        return new Image(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Image) && o.LJ(this.urlList, ((Image) obj).urlList);
    }

    public int hashCode() {
        List<String> list = this.urlList;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Image(urlList=");
        return C1NE.LIZIZ(LIZ, this.urlList, ')', LIZ);
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public Image(List<String> list) {
        this.urlList = list;
    }
}
