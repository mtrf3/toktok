package com.ss.android.ugc.aweme.ecommercelive.common.data;

import X.C79062V1e;
import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class ECImage {

    @InterfaceC65349Pkn("height")
    public final int height;

    @InterfaceC65349Pkn("url_list")
    public final String key;

    @InterfaceC65349Pkn("url")
    public final String url;

    @InterfaceC65349Pkn("key")
    public final String urlKey;

    @InterfaceC65349Pkn("width")
    public final int width;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ECImage)) {
            return false;
        }
        ECImage eCImage = (ECImage) obj;
        return o.LJ(this.key, eCImage.key) && this.width == eCImage.width && this.height == eCImage.height && o.LJ(this.url, eCImage.url) && o.LJ(this.urlKey, eCImage.urlKey);
    }

    public final int hashCode() {
        int hashCode;
        int LJ = C79062V1e.LJ(this.url, ((((this.key.hashCode() * 31) + this.width) * 31) + this.height) * 31, 31);
        String str = this.urlKey;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return LJ + hashCode;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ECImage(key=");
        LIZ.append(this.key);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", height=");
        LIZ.append(this.height);
        LIZ.append(", url=");
        LIZ.append(this.url);
        LIZ.append(", urlKey=");
        return q.LIZIZ(LIZ, this.urlKey, ')', LIZ);
    }

    public ECImage(String key, int i, int i2, String url, String str) {
        o.LJIIIZ(key, "key");
        o.LJIIIZ(url, "url");
        this.key = key;
        this.width = i;
        this.height = i2;
        this.url = url;
        this.urlKey = str;
    }
}
