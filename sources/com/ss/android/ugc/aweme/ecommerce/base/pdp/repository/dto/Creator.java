package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1FL;
import X.C78920UyC;
import X.InterfaceC65349Pkn;
import X.RWK;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class Creator implements Parcelable {
    public static final Parcelable.Creator<Creator> CREATOR = new RWK();

    @InterfaceC65349Pkn("is_affiliate_product")
    public final Boolean isAffiliateProduct;

    @InterfaceC65349Pkn("is_signed")
    public final Boolean isSigned;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Creator)) {
            return false;
        }
        Creator creator = (Creator) obj;
        return o.LJ(this.isAffiliateProduct, creator.isAffiliateProduct) && o.LJ(this.isSigned, creator.isSigned);
    }

    public final int hashCode() {
        Boolean bool = this.isAffiliateProduct;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isSigned;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Creator(isAffiliateProduct=");
        LIZ.append(this.isAffiliateProduct);
        LIZ.append(", isSigned=");
        return C78920UyC.LIZIZ(LIZ, this.isSigned, ')', LIZ);
    }

    public Creator(Boolean bool, Boolean bool2) {
        this.isAffiliateProduct = bool;
        this.isSigned = bool2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        Boolean bool = this.isAffiliateProduct;
        if (bool == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool);
        }
        Boolean bool2 = this.isSigned;
        if (bool2 == null) {
            out.writeInt(0);
        } else {
            C1FL.LJ(out, 1, bool2);
        }
    }
}
