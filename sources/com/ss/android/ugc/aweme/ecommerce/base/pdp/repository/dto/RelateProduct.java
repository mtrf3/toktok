package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C27523Ar9;
import X.C279017q;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class RelateProduct implements Parcelable {
    public static final Parcelable.Creator<RelateProduct> CREATOR = new C27523Ar9();

    @InterfaceC65349Pkn("images")
    public final List<Image> images;

    @InterfaceC65349Pkn("price")
    public final String price;

    @InterfaceC65349Pkn("product_id")
    public final String productID;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelateProduct)) {
            return false;
        }
        RelateProduct relateProduct = (RelateProduct) obj;
        return o.LJ(this.productID, relateProduct.productID) && o.LJ(this.price, relateProduct.price) && o.LJ(this.images, relateProduct.images);
    }

    public final int hashCode() {
        String str = this.productID;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.price;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<Image> list = this.images;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("RelateProduct(productID=");
        LIZ.append(this.productID);
        LIZ.append(", price=");
        LIZ.append(this.price);
        LIZ.append(", images=");
        return C1NE.LIZIZ(LIZ, this.images, ')', LIZ);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.productID);
        out.writeString(this.price);
        List<Image> list = this.images;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        Iterator LIZIZ = C279017q.LIZIZ(out, 1, list);
        while (LIZIZ.hasNext()) {
            out.writeParcelable((Parcelable) LIZIZ.next(), i);
        }
    }

    public RelateProduct(String str, String str2, List<Image> list) {
        this.productID = str;
        this.price = str2;
        this.images = list;
    }
}
