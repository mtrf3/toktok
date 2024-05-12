package com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto;

import X.C1FJ;
import X.C1FL;
import X.C69685RWn;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SkuQuantityProperty implements Parcelable {
    public static final Parcelable.Creator<SkuQuantityProperty> CREATOR = new C69685RWn();

    @InterfaceC65349Pkn("quantity_minus_support_edit")
    public final Boolean canLessThanDefaultQuantity;

    @InterfaceC65349Pkn("default_add_cart_quantity")
    public final Integer defaultAddCartQuantity;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuQuantityProperty)) {
            return false;
        }
        SkuQuantityProperty skuQuantityProperty = (SkuQuantityProperty) obj;
        return o.LJ(this.defaultAddCartQuantity, skuQuantityProperty.defaultAddCartQuantity) && o.LJ(this.canLessThanDefaultQuantity, skuQuantityProperty.canLessThanDefaultQuantity);
    }

    public final int hashCode() {
        Integer num = this.defaultAddCartQuantity;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.canLessThanDefaultQuantity;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SkuQuantityProperty(defaultAddCartQuantity=");
        LIZ.append(this.defaultAddCartQuantity);
        LIZ.append(", canLessThanDefaultQuantity=");
        return C78920UyC.LIZIZ(LIZ, this.canLessThanDefaultQuantity, ')', LIZ);
    }

    public SkuQuantityProperty(Integer num, Boolean bool) {
        this.defaultAddCartQuantity = num;
        this.canLessThanDefaultQuantity = bool;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Integer num = this.defaultAddCartQuantity;
        if (num == null) {
            out.writeInt(0);
        } else {
            C1FJ.LJ(out, 1, num);
        }
        Boolean bool = this.canLessThanDefaultQuantity;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
    }
}
