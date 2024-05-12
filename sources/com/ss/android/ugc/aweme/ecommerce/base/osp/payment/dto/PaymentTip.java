package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentTip {

    @InterfaceC65349Pkn("dark_font_color")
    public final String darkFontColor;

    @InterfaceC65349Pkn("font_color")
    public final String fontColor;

    @InterfaceC65349Pkn("tips")
    public final String tips;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentTip() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentTip)) {
            return false;
        }
        PaymentTip paymentTip = (PaymentTip) obj;
        return o.LJ(this.tips, paymentTip.tips) && o.LJ(this.fontColor, paymentTip.fontColor) && o.LJ(this.darkFontColor, paymentTip.darkFontColor);
    }

    public final int hashCode() {
        String str = this.tips;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.fontColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.darkFontColor;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentTip(tips=");
        LIZ.append(this.tips);
        LIZ.append(", fontColor=");
        LIZ.append(this.fontColor);
        LIZ.append(", darkFontColor=");
        return q.LIZIZ(LIZ, this.darkFontColor, ')', LIZ);
    }

    public PaymentTip(String str, String str2, String str3) {
        this.tips = str;
        this.fontColor = str2;
        this.darkFontColor = str3;
    }

    public /* synthetic */ PaymentTip(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
