package com.ss.android.ugc.aweme.ecommerce.base.pdp.module.shipping;

import X.C27133Akr;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShippingDialogDto implements Parcelable {
    public static final Parcelable.Creator<ShippingDialogDto> CREATOR = new C27133Akr();

    @InterfaceC65349Pkn("body_text")
    public final String bodyText;

    @InterfaceC65349Pkn("button_text")
    public final String buttonText;

    @InterfaceC65349Pkn("header_text")
    public final String headerText;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingDialogDto)) {
            return false;
        }
        ShippingDialogDto shippingDialogDto = (ShippingDialogDto) obj;
        return o.LJ(this.headerText, shippingDialogDto.headerText) && o.LJ(this.bodyText, shippingDialogDto.bodyText) && o.LJ(this.buttonText, shippingDialogDto.buttonText);
    }

    public final int hashCode() {
        String str = this.headerText;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.bodyText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buttonText;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.headerText);
        out.writeString(this.bodyText);
        out.writeString(this.buttonText);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShippingDialogDto(headerText=");
        LIZ.append(this.headerText);
        LIZ.append(", bodyText=");
        LIZ.append(this.bodyText);
        LIZ.append(", buttonText=");
        return q.LIZIZ(LIZ, this.buttonText, ')', LIZ);
    }

    public ShippingDialogDto(String str, String str2, String str3) {
        this.headerText = str;
        this.bodyText = str2;
        this.buttonText = str3;
    }
}
