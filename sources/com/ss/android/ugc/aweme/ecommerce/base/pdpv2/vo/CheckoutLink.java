package com.ss.android.ugc.aweme.ecommerce.base.pdpv2.vo;

import X.C27165AlN;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class CheckoutLink implements Parcelable {
    public static final Parcelable.Creator<CheckoutLink> CREATOR = new C27165AlN();

    @InterfaceC65349Pkn("desc")
    public final String desc;

    @InterfaceC65349Pkn("link")
    public final String link;

    @InterfaceC65349Pkn("link_text")
    public final String linkText;

    @InterfaceC65349Pkn("title")
    public final String title;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutLink)) {
            return false;
        }
        CheckoutLink checkoutLink = (CheckoutLink) obj;
        return o.LJ(this.title, checkoutLink.title) && o.LJ(this.desc, checkoutLink.desc) && o.LJ(this.linkText, checkoutLink.linkText) && o.LJ(this.link, checkoutLink.link);
    }

    public final int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.linkText;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.link;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.title);
        out.writeString(this.desc);
        out.writeString(this.linkText);
        out.writeString(this.link);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CheckoutLink(title=");
        LIZ.append(this.title);
        LIZ.append(", desc=");
        LIZ.append(this.desc);
        LIZ.append(", linkText=");
        LIZ.append(this.linkText);
        LIZ.append(", link=");
        return q.LIZIZ(LIZ, this.link, ')', LIZ);
    }

    public CheckoutLink(String str, String str2, String str3, String str4) {
        this.title = str;
        this.desc = str2;
        this.linkText = str3;
        this.link = str4;
    }
}
