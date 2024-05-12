package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C69627RUh;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import defpackage.q;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ProductLogo implements Parcelable {
    public static final Parcelable.Creator<ProductLogo> CREATOR = new C69627RUh();

    @InterfaceC65349Pkn("dark_mode_image")
    public final Image darkModeImage;

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("productLogoType")
    public final Integer productLogoType;

    @InterfaceC65349Pkn("promotion_id")
    public final String promotionId;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductLogo)) {
            return false;
        }
        ProductLogo productLogo = (ProductLogo) obj;
        return o.LJ(this.image, productLogo.image) && o.LJ(this.darkModeImage, productLogo.darkModeImage) && o.LJ(this.productLogoType, productLogo.productLogoType) && o.LJ(this.promotionId, productLogo.promotionId);
    }

    public final int hashCode() {
        Image image = this.image;
        int hashCode = (image == null ? 0 : image.hashCode()) * 31;
        Image image2 = this.darkModeImage;
        int hashCode2 = (hashCode + (image2 == null ? 0 : image2.hashCode())) * 31;
        Integer num = this.productLogoType;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.promotionId;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        int intValue;
        o.LJIIIZ(out, "out");
        out.writeParcelable(this.image, i);
        out.writeParcelable(this.darkModeImage, i);
        Integer num = this.productLogoType;
        if (num == null) {
            intValue = 0;
        } else {
            out.writeInt(1);
            intValue = num.intValue();
        }
        out.writeInt(intValue);
        out.writeString(this.promotionId);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductLogo(image=");
        LIZ.append(this.image);
        LIZ.append(", darkModeImage=");
        LIZ.append(this.darkModeImage);
        LIZ.append(", productLogoType=");
        LIZ.append(this.productLogoType);
        LIZ.append(", promotionId=");
        return q.LIZIZ(LIZ, this.promotionId, ')', LIZ);
    }

    public ProductLogo(Image image, Image image2, Integer num, String str) {
        this.image = image;
        this.darkModeImage = image2;
        this.productLogoType = num;
        this.promotionId = str;
    }
}
