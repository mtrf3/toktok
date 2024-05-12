package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model;

import X.InterfaceC65349Pkn;
import X.S8F;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TemplateFieldProduct implements Parcelable {
    public static final Parcelable.Creator<TemplateFieldProduct> CREATOR = new S8F();

    @InterfaceC65349Pkn("product_id")
    public final String productId;

    @InterfaceC65349Pkn("product_image_url")
    public final String productImage;

    @InterfaceC65349Pkn("product_index")
    public final String productIndex;

    @InterfaceC65349Pkn("product_image_origin_url")
    public final String productOriginImage;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        String str = this.productId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.productImage;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.productOriginImage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.productIndex;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.productId);
        out.writeString(this.productImage);
        out.writeString(this.productOriginImage);
        out.writeString(this.productIndex);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("TemplateFieldProduct(productId=");
        LIZ.append(this.productId);
        LIZ.append(", productImage=");
        LIZ.append(this.productImage);
        LIZ.append(", productOriginImage=");
        LIZ.append(this.productOriginImage);
        LIZ.append(", productIndex=");
        return q.LIZIZ(LIZ, this.productIndex, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof TemplateFieldProduct)) {
            return false;
        }
        TemplateFieldProduct templateFieldProduct = (TemplateFieldProduct) obj;
        if (!ujb.o.LJJJJIZL(this.productId, templateFieldProduct.productId, false) || !ujb.o.LJJJJIZL(this.productImage, templateFieldProduct.productImage, false) || !ujb.o.LJJJJIZL(this.productIndex, templateFieldProduct.productIndex, false)) {
            return false;
        }
        return true;
    }

    public TemplateFieldProduct(String str, String str2, String str3, String str4) {
        this.productId = str;
        this.productImage = str2;
        this.productOriginImage = str3;
        this.productIndex = str4;
    }

    public /* synthetic */ TemplateFieldProduct(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, str4);
    }
}
