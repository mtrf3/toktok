package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto;

import X.InterfaceC65349Pkn;
import X.X1D;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class PaymentLabel {

    @InterfaceC65349Pkn("background_color")
    public final String backgroundColor;

    @InterfaceC65349Pkn("dark_background_color")
    public final String darkBackgroundColor;

    @InterfaceC65349Pkn("dark_font_color")
    public final String darkFontColor;

    @InterfaceC65349Pkn("font_color")
    public final String fontColor;

    @InterfaceC65349Pkn("label_name")
    public final String labelName;

    /* JADX WARN: Multi-variable type inference failed */
    public PaymentLabel() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 31, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentLabel)) {
            return false;
        }
        PaymentLabel paymentLabel = (PaymentLabel) obj;
        return o.LJ(this.labelName, paymentLabel.labelName) && o.LJ(this.backgroundColor, paymentLabel.backgroundColor) && o.LJ(this.fontColor, paymentLabel.fontColor) && o.LJ(this.darkBackgroundColor, paymentLabel.darkBackgroundColor) && o.LJ(this.darkFontColor, paymentLabel.darkFontColor);
    }

    public final int hashCode() {
        String str = this.labelName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.backgroundColor;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.fontColor;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.darkBackgroundColor;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.darkFontColor;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaymentLabel(labelName=");
        LIZ.append(this.labelName);
        LIZ.append(", backgroundColor=");
        LIZ.append(this.backgroundColor);
        LIZ.append(", fontColor=");
        LIZ.append(this.fontColor);
        LIZ.append(", darkBackgroundColor=");
        LIZ.append(this.darkBackgroundColor);
        LIZ.append(", darkFontColor=");
        return q.LIZIZ(LIZ, this.darkFontColor, ')', LIZ);
    }

    public PaymentLabel(String str, String str2, String str3, String str4, String str5) {
        this.labelName = str;
        this.backgroundColor = str2;
        this.fontColor = str3;
        this.darkBackgroundColor = str4;
        this.darkFontColor = str5;
    }

    public /* synthetic */ PaymentLabel(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) == 0 ? str5 : null);
    }
}
