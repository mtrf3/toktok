package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C27552Arc;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.LinkRichText;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class SellerSellingPoint implements Parcelable {
    public static final Parcelable.Creator<SellerSellingPoint> CREATOR = new C27552Arc();

    @InterfaceC65349Pkn("selling_points")
    public final String sellingPoints;

    @InterfaceC65349Pkn("selling_tag")
    public final LinkRichText sellingTag;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SellerSellingPoint)) {
            return false;
        }
        SellerSellingPoint sellerSellingPoint = (SellerSellingPoint) obj;
        return o.LJ(this.sellingPoints, sellerSellingPoint.sellingPoints) && o.LJ(this.sellingTag, sellerSellingPoint.sellingTag);
    }

    public final int hashCode() {
        String str = this.sellingPoints;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        LinkRichText linkRichText = this.sellingTag;
        return hashCode + (linkRichText != null ? linkRichText.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SellerSellingPoint(sellingPoints=");
        LIZ.append(this.sellingPoints);
        LIZ.append(", sellingTag=");
        LIZ.append(this.sellingTag);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.sellingPoints);
        LinkRichText linkRichText = this.sellingTag;
        if (linkRichText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            linkRichText.writeToParcel(out, i);
        }
    }

    public SellerSellingPoint(String str, LinkRichText linkRichText) {
        this.sellingPoints = str;
        this.sellingTag = linkRichText;
    }
}
