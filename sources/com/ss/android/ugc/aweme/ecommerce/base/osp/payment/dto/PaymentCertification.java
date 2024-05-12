package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentCertification {

    @InterfaceC65349Pkn("dark_icons")
    public final List<CertificationIcon> dark_icons;

    @InterfaceC65349Pkn("icons")
    public final List<CertificationIcon> icons;

    @InterfaceC65349Pkn("title")
    public final String title;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentCertification)) {
            return false;
        }
        PaymentCertification paymentCertification = (PaymentCertification) obj;
        return o.LJ(this.title, paymentCertification.title) && o.LJ(this.icons, paymentCertification.icons) && o.LJ(this.dark_icons, paymentCertification.dark_icons);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<CertificationIcon> list = this.icons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<CertificationIcon> list2 = this.dark_icons;
        return hashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentCertification(title=");
        LIZ.append(this.title);
        LIZ.append(", icons=");
        LIZ.append(this.icons);
        LIZ.append(", dark_icons=");
        return C1NE.LIZIZ(LIZ, this.dark_icons, ')', LIZ);
    }

    public PaymentCertification(String str, List<CertificationIcon> list, List<CertificationIcon> list2) {
        this.title = str;
        this.icons = list;
        this.dark_icons = list2;
    }
}
