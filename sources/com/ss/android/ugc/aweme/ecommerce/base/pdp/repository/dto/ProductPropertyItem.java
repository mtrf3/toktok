package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C05040Hs;
import X.C26723AeF;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductPropertyItem implements Parcelable {
    public static final Parcelable.Creator<ProductPropertyItem> CREATOR = new C26723AeF();

    @InterfaceC65349Pkn("prop_id")
    public final Long propId;

    @InterfaceC65349Pkn("prop_name")
    public final String propName;

    @InterfaceC65349Pkn("prop_value")
    public final String propValue;

    /* JADX WARN: Multi-variable type inference failed */
    public ProductPropertyItem() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductPropertyItem)) {
            return false;
        }
        ProductPropertyItem productPropertyItem = (ProductPropertyItem) obj;
        return o.LJ(this.propId, productPropertyItem.propId) && o.LJ(this.propName, productPropertyItem.propName) && o.LJ(this.propValue, productPropertyItem.propValue);
    }

    public final int hashCode() {
        Long l = this.propId;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.propName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.propValue;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductPropertyItem(propId=");
        LIZ.append(this.propId);
        LIZ.append(", propName=");
        LIZ.append(this.propName);
        LIZ.append(", propValue=");
        return q.LIZIZ(LIZ, this.propValue, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Long l = this.propId;
        if (l == null) {
            out.writeInt(0);
        } else {
            C05040Hs.LIZLLL(out, 1, l);
        }
        out.writeString(this.propName);
        out.writeString(this.propValue);
    }

    public ProductPropertyItem(Long l, String str, String str2) {
        this.propId = l;
        this.propName = str;
        this.propValue = str2;
    }

    public /* synthetic */ ProductPropertyItem(Long l, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2);
    }
}
