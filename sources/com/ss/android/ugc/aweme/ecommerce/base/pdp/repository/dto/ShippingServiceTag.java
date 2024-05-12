package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C26727AeJ;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.Icon;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShippingServiceTag implements Parcelable {
    public static final Parcelable.Creator<ShippingServiceTag> CREATOR = new C26727AeJ();

    @InterfaceC65349Pkn("contents")
    public final String contents;

    @InterfaceC65349Pkn("icon")
    public final Icon icon;

    @InterfaceC65349Pkn("name")
    public final String name;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingServiceTag)) {
            return false;
        }
        ShippingServiceTag shippingServiceTag = (ShippingServiceTag) obj;
        return o.LJ(this.icon, shippingServiceTag.icon) && o.LJ(this.name, shippingServiceTag.name) && o.LJ(this.contents, shippingServiceTag.contents);
    }

    public final int hashCode() {
        Icon icon = this.icon;
        int hashCode = (icon == null ? 0 : icon.hashCode()) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.contents;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Icon icon = this.icon;
        if (icon == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            icon.writeToParcel(out, i);
        }
        out.writeString(this.name);
        out.writeString(this.contents);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShippingServiceTag(icon=");
        LIZ.append(this.icon);
        LIZ.append(", name=");
        LIZ.append(this.name);
        LIZ.append(", contents=");
        return q.LIZIZ(LIZ, this.contents, ')', LIZ);
    }

    public ShippingServiceTag(Icon icon, String str, String str2) {
        this.icon = icon;
        this.name = str;
        this.contents = str2;
    }
}
