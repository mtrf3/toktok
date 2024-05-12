package com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto;

import X.C1NE;
import X.C27619Ash;
import X.InterfaceC65349Pkn;
import X.X1D;
import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class ProductDetails implements Parcelable {
    public static final Parcelable.Creator<ProductDetails> CREATOR = new C27619Ash();

    @InterfaceC65349Pkn("content")
    public final List<String> content;

    @InterfaceC65349Pkn("image")
    public final Image image;

    @InterfaceC65349Pkn("text")
    public final String text;

    @InterfaceC65349Pkn("type")
    public final String type;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetails)) {
            return false;
        }
        ProductDetails productDetails = (ProductDetails) obj;
        return o.LJ(this.type, productDetails.type) && o.LJ(this.image, productDetails.image) && o.LJ(this.text, productDetails.text) && o.LJ(this.content, productDetails.content);
    }

    public final int hashCode() {
        String str = this.type;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Image image = this.image;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        String str2 = this.text;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.content;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        o.LJIIIZ(out, "out");
        out.writeString(this.type);
        out.writeParcelable(this.image, i);
        out.writeString(this.text);
        out.writeStringList(this.content);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ProductDetails(type=");
        LIZ.append(this.type);
        LIZ.append(", image=");
        LIZ.append(this.image);
        LIZ.append(", text=");
        LIZ.append(this.text);
        LIZ.append(", content=");
        return C1NE.LIZIZ(LIZ, this.content, ')', LIZ);
    }

    public ProductDetails(String str, Image image, String str2, List<String> list) {
        this.type = str;
        this.image = image;
        this.text = str2;
        this.content = list;
    }
}
