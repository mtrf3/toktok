package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C26726AeI;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ShippingServicePopup implements Parcelable {
    public static final Parcelable.Creator<ShippingServicePopup> CREATOR = new C26726AeI();

    @InterfaceC65349Pkn("header")
    public final String header;

    @InterfaceC65349Pkn("shipping_service_tags")
    public final List<ShippingServiceTag> shippingServiceTags;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingServicePopup)) {
            return false;
        }
        ShippingServicePopup shippingServicePopup = (ShippingServicePopup) obj;
        return o.LJ(this.header, shippingServicePopup.header) && o.LJ(this.shippingServiceTags, shippingServicePopup.shippingServiceTags);
    }

    public final int hashCode() {
        String str = this.header;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<ShippingServiceTag> list = this.shippingServiceTags;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ShippingServicePopup(header=");
        LIZ.append(this.header);
        LIZ.append(", shippingServiceTags=");
        return C1NE.LIZIZ(LIZ, this.shippingServiceTags, ')', LIZ);
    }

    public ShippingServicePopup(String str, List<ShippingServiceTag> list) {
        this.header = str;
        this.shippingServiceTags = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.header);
        List<ShippingServiceTag> list = this.shippingServiceTags;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            ((ShippingServiceTag) LIZIZ.next()).writeToParcel(out, i);
        }
    }
}
