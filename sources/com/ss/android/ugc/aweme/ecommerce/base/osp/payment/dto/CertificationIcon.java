package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class CertificationIcon {

    @InterfaceC65349Pkn("height")
    public final Integer height;

    @InterfaceC65349Pkn("uri")
    public final String uri;

    @InterfaceC65349Pkn("url_list")
    public final List<String> urlList;

    @InterfaceC65349Pkn("width")
    public final Integer width;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CertificationIcon)) {
            return false;
        }
        CertificationIcon certificationIcon = (CertificationIcon) obj;
        return o.LJ(this.height, certificationIcon.height) && o.LJ(this.width, certificationIcon.width) && o.LJ(this.uri, certificationIcon.uri) && o.LJ(this.urlList, certificationIcon.urlList);
    }

    public final int hashCode() {
        Integer num = this.height;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.width;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.uri;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.urlList;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CertificationIcon(height=");
        LIZ.append(this.height);
        LIZ.append(", width=");
        LIZ.append(this.width);
        LIZ.append(", uri=");
        LIZ.append(this.uri);
        LIZ.append(", urlList=");
        return C1NE.LIZIZ(LIZ, this.urlList, ')', LIZ);
    }

    public CertificationIcon(Integer num, Integer num2, String str, List<String> list) {
        this.height = num;
        this.width = num2;
        this.uri = str;
        this.urlList = list;
    }
}
